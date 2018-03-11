package L9;

public class Car6 {
    private boolean booleanValue = true;
    private char charValue = 'y';
    private String stringValue = "Opana";
    private long longValue = 1234567890L;
    private float floatValue = 12345.67890F;
    private double doubleValue = 12891.12348;
    private byte[] arrayValue ={1,2,3,4};

    public Car6(String stringValue, long longValue, float floatValue) {
        this.stringValue = stringValue;
        this.longValue = longValue;
        this.floatValue = floatValue;
    }
    @Override
    public int hashCode() {
        int result =17;

        result = 37* result+(booleanValue?1:0);
        result = 37*result+(int)charValue;
        result = 37*result+(stringValue==null?0:stringValue.hashCode());
        result = 37*result+(int)(longValue^(longValue>>>32));
        result = 37*result+Float.floatToIntBits( floatValue );
        long longBits = Double.doubleToLongBits( doubleValue );
        result = 37*result+(int)(longBits^(longBits>>>32));
        for (byte b:arrayValue)
            result= 37* result+(int)b;

            return result;

    }
}
