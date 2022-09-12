import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object Q3 extends App{

    printf("Money to transfer: ")
    val trans=readInt()
   
    val person1=new Account("997020834V", 1, 80000)
    val person2=new Account("985086492V", 2, 50000)

    person1.transfer(person2,trans)
    println("Money sender's Balance: "+person1.Balance)
    println("Money receiver's Balance: "+person2.Balance)

}

class Account(a:String, b:Int, c:Double){
    val NIC:String=a
    val AccNo:Int=b;
    var Balance:Double=c;
    override def toString ="["+NIC+":"+AccNo +":"+ Balance+"]"

    def withdraw(transfer_amount:Double)=this.Balance-transfer_amount;
    def deposit(transfer_amount:Double)=this.Balance+transfer_amount;

    def transfer(accnt:Account,trans:Double) ={
        this.Balance = this.withdraw(trans)
        accnt.Balance=accnt.deposit(trans)
    }
}
