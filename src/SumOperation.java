public class SumOperation {
    int getSum(int a, int b){
        Operator op = (x, x1) -> x-x1;
        return op.toOperate(a, b);
    }
}
