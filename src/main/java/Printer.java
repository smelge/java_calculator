public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets,int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int print(int pages,int copies){
        int total = pages * copies;
        if (this.sheets >= total){
            this.sheets = this.sheets - total;
            this.toner = this.toner - total;
            return this.sheets;
        }
        return this.sheets;
    }

    public int tonerLevel(){
        return this.toner;
    }

    public int refillPaper(int qty){
        this.sheets = this.sheets + qty;
        return this.sheets;
    }

    public int refillToner(){
        this.toner = 100;
        return this.toner;
    }
}
