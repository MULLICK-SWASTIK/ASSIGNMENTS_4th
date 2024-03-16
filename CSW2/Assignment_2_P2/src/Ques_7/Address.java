package Ques_7;
class Address {
    String plot_no,at,post;
    Address(String plot_no, String at, String post){
        this.plot_no=plot_no;
        this.at=at;
        this.post=post;
    }
    
    public String toString(){
        return "[Plot no.: "+this.plot_no+", At: "+this.at+", Post: "+this.post+"]";
    }
}
