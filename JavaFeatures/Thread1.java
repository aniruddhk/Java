package JavaFeatures;

public class Thread1 implements Runnable{
    private  StringBuilder stringBuffer;

    public Thread1(StringBuilder stringBuffer){
        this.stringBuffer = stringBuffer;
    }
    @Override
    public void run() {
        stringBuffer.append("1");
    }
}
