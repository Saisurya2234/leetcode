import java.util.*;
/**
1) sort the position with respect to all the elements use ny comparator:
2) if both R && L have same health means we have to eliminate & not add to stack:
3) if robots collide with eachother which has the least element we have to remove from the stack;
 which has the higher elements we have -1 from that health and add to stack;
  4) last we have to sort by using by index becoz before we sort by position so we have to return the ans by sortin gorder so we sort by index using comparator.

  comparator:
  sort by specific ex;position ; it will also sort all the elements with respect to position
 */

class Solution {
    class Robot {
        int index;
        int position;
        int health;
        char direction;
        Robot(int index, int position, int health, char direction) {
            this.index = index;
            this.position = position;
            this.health = health;
            this.direction = direction;
        }
    }
    // All type must create in robot type:

    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> result = new ArrayList<>();// for return the ans:
        Robot[] robots = new Robot[positions.length];
        Stack<Robot> stack = new Stack<>();

        // Create an array of Robot objects
        for (int i = 0; i < positions.length; i++) {
            robots[i] = new Robot(i, positions[i], healths[i], directions.charAt(i));
        }

        // Sort robots based on their positions
        Arrays.sort(robots, Comparator.comparingInt(a -> a.position));
        // comparator is used to sort based on their position with corresponding other elements:

        for (Robot robot : robots) {
            if (robot.direction == 'R') {
                stack.push(robot);
                continue;
            }
            // Handle collisions for robots moving to the left
            while (!stack.isEmpty() && stack.peek().direction == 'R' && robot.health > 0) {
                Robot rightRobot = stack.peek();
                if (rightRobot.health == robot.health) {
                    stack.pop();
                    robot.health = 0;
                } else if (rightRobot.health < robot.health) {
                    stack.pop();
                    robot.health -= 1;
                } else { // rightRobot.health > robot.health
                    rightRobot.health -= 1;
                    robot.health = 0;
                }
            }
            if (robot.health > 0) {
                stack.push(robot);
            }
        }

        // Collect the remaining robots and sort them by their original indices
        List<Robot> survivingRobots = new ArrayList<>(stack);
        survivingRobots.sort(Comparator.comparingInt(a -> a.index));

        for (Robot robot : survivingRobots) {
            result.add(robot.health);
        }

        return result;
    }
}