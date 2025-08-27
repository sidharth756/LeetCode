class Solution {
public:
    
    int memo(int i, int j, int dir, int turn, vector<vector<int>>& grid,
             vector<vector<vector<vector<int>>>>& dp) {
        int n = grid.size();
        int m = grid[0].size();
        int drow[] = {-1, 1, 1, -1};
        int dcol[] = {1, 1, -1, -1};
        if (dp[i][j][dir][turn] != -1) {
            return dp[i][j][dir][turn];
        }
        int nx = i + drow[dir];
        int ny = j + dcol[dir];
        int notturn = 1;
        if (nx <= n-1 && nx >= 0 && ny <= m-1 && ny >= 0 &&
            abs(grid[i][j] - grid[nx][ny]) == 2) {
            notturn = 1 + memo(nx, ny, dir, turn, grid, dp);
        }
        int turnn = 1;
        nx = i + drow[(dir + 1) % 4];
        ny = j + dcol[(dir + 1) % 4];
        if (turn == 0 && nx <= n-1 && nx >= 0 && ny <= m-1 && ny >= 0 &&
            abs(grid[i][j] - grid[nx][ny]) == 2) {
            turnn = 1 + memo(nx, ny, (dir + 1) % 4, turn + 1, grid, dp);
        }
        return dp[i][j][dir][turn]=max(notturn, turnn);
    }
    int lenOfVDiagonal(vector<vector<int>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        int ans = 0;
        int drow[] = {-1, 1, 1, -1};
        int dcol[] = {1, 1, -1, -1};
        vector<vector<vector<vector<int>>>> dp(
            n, vector<vector<vector<int>>>(
                   m, vector<vector<int>>(4, vector<int>(2, -1))));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    ans=max(ans,1);
                    int nx,ny;
                    for (int dir = 0; dir < 4; dir++) {
                        nx = i + drow[dir];
                        ny = j + dcol[dir];
                        if (nx < 0 or ny < 0 or nx > n - 1 or ny > m - 1 or
                            grid[nx][ny] == 1 or grid[nx][ny] == 0) {
                            continue;
                        }
                        //int temp=1+memo(nx,ny,dir,0,grid,dp);
                        ans = max(ans,1+memo(nx,ny,dir,0,grid,dp));
                    }
                }
            }
        }
        return ans;
    }
};