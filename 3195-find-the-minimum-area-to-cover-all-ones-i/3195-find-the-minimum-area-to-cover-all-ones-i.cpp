class Solution {
public:
    int minimumArea(vector<vector<int>>& grid) {
        int R = grid.size();
        int C = grid[0].size();

        int t = R, l = C;
        int b = -1, r = -1;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1) {
                    t = min(t, i);
                    l = min(l, j);
                    b = max(b, i);
                    r = max(r, j);
                }
            }
        }

        int height = (b - t) + 1;
        int width = (r - l) + 1;
        return height * width;
    }
};