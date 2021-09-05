import java.security.Key;
import java.security.acl.LastOwnerException;
import java.util.*;

import javax.swing.text.Segment;

import jdk.nashorn.internal.ir.ReturnNode;

public class CoveringSegments {

    private static ArrayList<Integer> optimalPoints(ArrayList<Segment> segments) {
        /*
         * for(int j = 0; j < segments.length; j++){ for(int k = j; k
         * <segments.length-j-1; j++){ if (segments[j].end > segments[j+1].end){
         * segments[j].start = segments[j+1].start + segments[j].start;
         * segments[j+1].start = segments[j].start - segments[j+1].start;
         * segments[j].start = segments[j].start - segments[j+1].start; segments[j].end
         * = segments[j+1].end + segments[j].end; segments[j+1].end = segments[j].end -
         * segments[j+1].end; segments[j].end = segments[j].end - segments[j+1].end; } }
         * 
         * } int[] points = new int[2 * segments.length]; for (int i = 0; i <
         * segments.length; i++) { points[2 * i] = segments[i].start; points[2 * i + 1]
         * = segments[i].end; } for(i=0;i<2*segments.length;i++){ if (i%2 == 0){
         * points[i] } } return points; }
         */
        Collections.sort(segments);
        ArrayList<Integer> points = new ArrayList<Integer>();
        int lastPoint = segments.get(0).getEnd();
        points.add(lastPoint);
        for (int i = 1; i < segments.size(); i++) {
            if (segments.get(i).inSegment(lastPoint) == false) {
                lastPoint = segments.get(i).getEnd();
                points.add(lastPoint);
            }
        }
        return points;
    }

    private static class Segment implements Comparable<Segment> {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean inSegment(int pt) {
            return pt <= this.end && pt >= this.start;
        }

        public int getEnd() {
            return this.end;
        }

        public int compareTo(Segment s) {
            if (this.end > s.getEnd())
                return 1;
            else if (this.end < s.getEnd())
                return -1;
            else
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Segment> segments = new ArrayList<Segment>();
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments.add(new Segment(start, end));
        }
        ArrayList<Integer> points = optimalPoints(segments);
        System.out.println(points.size());
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}
