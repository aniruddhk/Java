package JavaFeatures;

public class Thread2 implements Runnable{
    private  StringBuilder stringBuffer;

    public Thread2(StringBuilder stringBuffer){
        this.stringBuffer = stringBuffer;
    }
    @Override
    public void run() {
        stringBuffer.append("2");
    }
}
