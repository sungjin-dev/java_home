package package_hash_equal;

public class Key {
    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override 
    public boolean equals(Object obj) {
        if(obj instanceof Key) {
            Key comparKey = (Key) obj;
            if(this.number == comparKey.number) {
                return true;
            }
        }

        return false;
    }
}
