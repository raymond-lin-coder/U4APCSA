package ITArrayListAssessment;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fileData = getFileData("ITArrayListAssessment/brick_layout");
        ArrayList<Brick> bricks = new ArrayList<Brick>();
        for (String line : fileData) {
            String[] points = line.split(",");
            int start = Integer.parseInt(points[0]);
            int end = Integer.parseInt(points[1]);
            Brick b = new Brick(start, end);
            bricks.add(b);
        }


        System.out.println(partOne(bricks));
        System.out.println(partTwo(bricks));
    }

    private static int partOne(ArrayList<Brick> bricks) {
        // Implement me!
        int totalLength = 0;
        for(int i = 0; i < bricks.size(); i++) {
            totalLength += (bricks.get(i).getEnd() - bricks.get(i).getStart());
        }
        return totalLength;
    }

    private static int partTwo(ArrayList<Brick> bricks) {
        // Implement me!
        ArrayList<Integer> positionList = new ArrayList<Integer>();
        ArrayList<Integer> bricksOnGround = new ArrayList<Integer>();
        for(Brick brick : bricks) {
            int start = brick.getStart();
            int end = brick.getEnd();
            boolean onTopOfSomething = false;
            for(int i = start; i <= end; i++) {
                if (positionList.contains(i)) {
                    onTopOfSomething = true;
                }
                else {
                    positionList.add(i);
                }
            }
            if (!onTopOfSomething) {
                for(int i = start; i <= end; i++) {
                    bricksOnGround.add(i);
                }
            }
        }
        System.out.println(positionList);
        System.out.println(bricksOnGround);
        ArrayList<Integer> truePositionList = new ArrayList<Integer>();
        for(Brick brick : bricks) {
            int start = brick.getStart();
            int end = brick.getEnd();
            for(int i = start; i <= end; i++) {
                truePositionList.add(i);
            }
        }
        int maxHeight = 0;
        for(Integer integer : bricksOnGround) {
            int tempHeight = 0;
            for(Integer integer2 : truePositionList) {
                if (integer2 == integer) {
                    tempHeight++;
                }
            }
            if (tempHeight > maxHeight) {
                maxHeight = tempHeight;
            }
        }
        return maxHeight;
    }

    public static ArrayList<String> getFileData(String fileName) {
        File f = new File(fileName);
        Scanner s = null;
        try {
            s = new Scanner(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(1);
        }
        ArrayList<String> fileData = new ArrayList<String>();
        while (s.hasNextLine())
            fileData.add(s.nextLine());

        return fileData;
    }
}