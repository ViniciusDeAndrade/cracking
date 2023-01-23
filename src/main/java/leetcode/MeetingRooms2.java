package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRooms2 {


    //    [[0,30],[5,10],[15,20]]
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        PriorityQueue<Integer> allocator = new PriorityQueue<>(intervals.length, Comparator.comparingInt(a -> a));

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        allocator.add(intervals[0][1]);

        // Iterate over remaining intervals
        for (int index = 1; index < intervals.length; index++) {

            // If the room due to free up the earliest is free, assign that room to this meeting.
            if (intervals[index][0] >= allocator.peek()) {
                allocator.poll();
            }

            // If a new room is to be assigned, then also we add to the heap,
            // If an old room is allocated, then also we have to add to the heap with updated end time.
            allocator.add(intervals[index][1]);
        }

        // The size of the heap tells us the minimum rooms required for all the meetings.
        return allocator.size();
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{0, 30}, {5, 10}, {15, 20}}; //2
        int[][] intervals2 = new int[][]{{7, 10}, {2, 4}}; //2
        int[][] intervals3 = new int[][]{{2, 4}}; //1
        int[][] intervals4 = new int[][]{{5, 8}, {6, 8}}; //2

        MeetingRooms2 meetingRooms2 = new MeetingRooms2();
        int result = meetingRooms2.minMeetingRooms(intervals);
        System.out.println(result);
    }
}
