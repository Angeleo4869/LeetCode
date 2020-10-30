//给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。 
//
// 网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。 
//
// 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿
//的周长。 
//
// 
//
// 示例 : 
//
// 输入:
//[[0,1,0,0],
// [1,1,1,0],
// [0,1,0,0],
// [1,1,0,0]]
//
//输出: 16
//
//解释: 它的周长是下面图片中的 16 个黄色的边：
//
//
// 
// Related Topics 哈希表 
// 👍 306 👎 0


////leetcode submit region begin(Prohibit modification and deletion)
// DFS 解法，对岛屿进行扫描
//class Solution {
//    int n = 0,m = 0,ans = 0;
//    int[][] dir = {{-1,0},{1,0},{0,1},{0,-1}};
//    public int islandPerimeter(int[][] grid) {
//        n = grid.length;
//        m = grid[0].length;
//        int[][] cont = new int[n][m];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(grid[i][j] == 1){
//                    dfs(grid,cont,i,j);
//                    break;
//                }
//            }
//        }
//        return  ans;
//    }
//
//    public void  dfs(int[][] grid ,int[][] userd ,int x ,int y ){
//        if( x < 0 || x >= n || y < 0 || y >= m || grid[x][y] == 0 ){
//            ans ++;
//            return ;
//        }
//        if(userd[x][y] == 1){
//            return;
//        }
//        userd[x][y] = 1;
//        for(int i=0;i<4;i++){
//            dfs(grid, userd,x + dir[i][0] , y + dir[i][1]);
//        }
//
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int anx = 0;
        for(int i=0;i < n;i++){
            for(int j=0;j < m;j++){
                if(grid[i][j] == 1) {
                    anx += 4;
                    if (i > 0 && grid[i - 1][j] == 1) {
                        anx--;
                    }
                    if (i < n - 1 && grid[i + 1][j] == 1) {
                        anx--;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        anx--;
                    }
                    if (j < m - 1 && grid[i][j + 1] == 1) {
                        anx--;
                    }
                }
            }
        }
        return  anx;
    }
}
//leetcode submit region end(Prohibit modification and deletion)