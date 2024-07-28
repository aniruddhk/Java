package JavaFeatures;

public class Thread4 implements Runnable{
    private  StringBuilder stringBuffer;

    public Thread4(StringBuilder stringBuffer){
        this.stringBuffer = stringBuffer;
    }
    @Override
    public void run() {
        stringBuffer.append("4");
    }
}
