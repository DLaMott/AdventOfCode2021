package com.company.dayFive;

import com.company.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class day5Parts {
    public static ArrayList<String> x = (ArrayList<String>) Util.readFileString("src/com/company/dayFive/day5");

    public static void main(String[] args){
        System.out.println(part1(x).toString());
        System.out.println(partTwo(x).toString());
    }


    public static Object part1 (ArrayList<String> y){

        Map<Point, Integer> map = new HashMap<>();

        List<Line> lines = new ArrayList<>();
        for (String entry : y){
            String[] pointsStr = entry.split(" -> ");
            String[] beginStr = pointsStr[0].split(",");
            String[] endStr = pointsStr[1].split(",");
            Line line = new Line(new Point(Integer.parseInt(beginStr[0]), Integer.parseInt(beginStr[1])), new Point(Integer.parseInt(endStr[0]), Integer.parseInt(endStr[1])));
            lines.add(line);
        }

        for (Line line : lines){
            for(Point point : line.listPoints(true)){
                map.compute(point, (p, i) -> i == null ? 1 : i + 1);
            }
        }
        return map.values().stream().filter(i -> i > 1).count();
    }

    public static Object partTwo(ArrayList<String> y){
        Map<Point, Integer> map = new HashMap<>();

        List<Line> lines = new ArrayList<>();
        for (String entry : y){
            String[] pointsStr = entry.split(" -> ");
            String[] beginStr = pointsStr[0].split(",");
            String[] endStr = pointsStr[1].split(",");
            Line line = new Line(new Point(Integer.parseInt(beginStr[0]), Integer.parseInt(beginStr[1])), new Point(Integer.parseInt(endStr[0]), Integer.parseInt(endStr[1])));
            lines.add(line);
        }

        for (Line line : lines){
            for(Point point : line.listPoints(false)){
                map.compute(point, (p, i) -> i == null ? 1 : i + 1);
            }
        }
        return map.values().stream().filter(i -> i > 1).count();
    }
}
