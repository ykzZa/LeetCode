package easy

class Problem1672 {

    fun maximumWealth(accounts: Array<IntArray>): Int {
        for (i in accounts.indices) {
            for (j in 1..<accounts[i].size) {
                accounts[i][0] += accounts[i][j]
            }
            if(i > 0) {
                if(accounts[i - 1][0] > accounts[i][0]) {
                    accounts[i][0] = accounts[i - 1][0]
                }
            }
        }

        return accounts[accounts.size - 1][0]
    }
}