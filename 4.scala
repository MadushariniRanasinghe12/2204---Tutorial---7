object Q4 extends App{
    val acc1=new account("1V",1,40000)
    val acc2=new account("2V",2,-2000)
    val acc3=new account("3V",3,80000)
    val acc4=new account("4V",4,-500)

    var Bank:List[account]=List(acc1,acc2,acc3,acc4)

    def checkNeg(List:List[account])={
        List.filter(x=>x.Balance<0)
    }
    println("\nNegative balance account: "+checkNeg(Bank)+"\n")

    SumAccount(Bank)
    Interest(Bank)

    def SumAccount(List:List[account])={
        var sum=List.foldLeft(0.0)((sum,y)=>sum+y.Balance) 
        println("Sum of all account balances: "+sum+"\n")
    }

    def Interest(List:List[account])={
        List.map(x=>{
            if(x.Balance>0){
                x.Balance=x.Balance+x.Balance*0.05
                println("Final balance of account "+x.AccNo+"="+(x.Balance))
            }
            else{
                x.Balance=x.Balance+x.Balance*0.1     
                println("Final balance of account "+x.AccNo+"="+(x.Balance))           
            }
        })
    }
}

class account(a:String, b:Int, c:Double){
    val NIC:String=a;
    val AccNo:Int=b;
    var Balance:Double=c

    override def toString ="["+NIC+":"+AccNo +":"+ Balance+"]"

}