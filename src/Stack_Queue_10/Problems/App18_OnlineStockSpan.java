package Stack_Queue_10.Problems;

/*
Input
["StockSpanner", "next", "next", "next", "next", "next", "next", "next"]
[[], [100], [80], [60], [70], [60], [75], [85]]
Output
[null, 1, 1, 1, 2, 1, 4, 6]

Explanation
StockSpanner stockSpanner = new StockSpanner();
stockSpanner.next(100); // return 1
stockSpanner.next(80);  // return 1
stockSpanner.next(60);  // return 1
stockSpanner.next(70);  // return 2
stockSpanner.next(60);  // return 1
stockSpanner.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
stockSpanner.next(85);  // return 6

*/
public class App18_OnlineStockSpan {
    public static void main(String[] args) {
        /*
            class StockSpanner {
                int idx;
                Stack<Pair> st;

                class Pair{
                    int data;
                    int idx;
                    public Pair(int data, int idx){
                        this.data = data;
                        this.idx = idx;
                    }
                    public int getData(){
                        return this.data;
                    }
                    public int getIdx(){
                        return this.idx;
                    }
                }
                public StockSpanner() {
                    this.st = new Stack<>();
                }
                public int next(int price) {
                    if(st.isEmpty()){
                        st.push(new Pair(price,idx++));
                        return 1;
                    }
                    else{
                        int ans;
                        while(!st.isEmpty() && st.peek().data <= price){
                            st.pop();
                        }
                        if(st.size() == 0){
                            ans = idx + 1;
                        }
                        else{
                            // 100 80 60 70 [70 is larger than 60 so it will be 2]
                            // 100 80 60 70 60 75 [75 is larger than 60,70,60 and 75 itself so it will be 4]
                            // 100 80 60 70 60 75 85[75 is larger than 60,70,60 and 75 itself so it will be 4]
                            ans = idx - st.peek().idx;
                        }
                        st.push(new Pair(price,idx++));
                        return ans;
                    }
                }
            }
        */
    }
}
