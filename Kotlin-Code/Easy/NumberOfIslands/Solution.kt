class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var count = 0
        for (i in 0 until grid.size) {
            for(j in 0 until grid[i].size){
                if(grid[i][j] == '1'){
                    count++
                    clearRestOfLand(grid,i,j)
                }
                print(grid[i][j] + " ")
            }
            println()
        }
        return count
    }

    private fun clearRestOfLand(grid: Array<CharArray>, i: Int, j: Int){
        if (i < 0 || j < 0 || i >= grid.size || j >= grid[i].size || grid[i][j] == '0') return

        grid[i][j] = '0'
        clearRestOfLand(grid, i+1, j)
        clearRestOfLand(grid, i-1, j)
        clearRestOfLand(grid, i, j+1)
        clearRestOfLand(grid, i, j-1)
        return
    }

    private fun printLand(grid: Array<CharArray>){
        for (i in 0 until grid.size) {
            for(j in 0 until grid[i].size){

            }
        }
    }

}

fun main() {
    val grid = arrayOf(
        charArrayOf('0','1','0','0','0'),
        charArrayOf('0','0','1','1','0'),
        charArrayOf('0','0','0','1','1'),
        charArrayOf('0','0','0','0','0'),
        charArrayOf('1','0','1','0','0')
    )

    println(Solution().numIslands(grid))

}