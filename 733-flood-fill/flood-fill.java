class Solution {
    public void back(int[][] image, int sr, int sc, int color, int colour, boolean[][] visited) {
        // Base case checks: out of bounds or already visited
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || visited[sr][sc])
            return;

        // Checking if the current pixel's color matches the target color for replacement
        if (image[sr][sc] == colour) {
            // Changing the current pixel's color
            image[sr][sc] = color;
            // Marking the current pixel as visited
            visited[sr][sc] = true;

            // Recursive calls to adjacent pixels
            back(image, sr + 1, sc, color, colour, visited);
            back(image, sr, sc + 1, color, colour, visited);
            back(image, sr - 1, sc, color, colour, visited);
            back(image, sr, sc - 1, color, colour, visited);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] != color) {
            // Creating a boolean matrix to keep track of visited pixels
            boolean[][] visited = new boolean[image.length][image[0].length];
            // Initiating the flood-fill process from the specified pixel
            back(image, sr, sc, color, image[sr][sc], visited);
        }
        return image;
    }
}