package infnet.basicDataStructure.List;

public class List {
    private Object[] _inner = new Object[100];
    private int totalSize = 0;

    public void add(Object o) {
        this._inner[totalSize] = o;
        this.totalSize++;
        this.ensureSpace();
    }

    public void add(int position, Object o) {
        if (position < 0 || position > this.totalSize)
            throw new IllegalArgumentException();

        for (int i = this.totalSize - 1; i >= position; i--) {
            this._inner[i + 1] = this._inner[i];
        }

        this._inner[position] = o;
        this.totalSize++;
        this.ensureSpace();

    }

    public Object get(int position) {
        if (position < 0 || position > this.totalSize)
            throw new IllegalArgumentException();

        return this._inner[position];
    }

    public void remove(int position) {
        if (position < 0 || position > this.totalSize)
            throw new IllegalArgumentException("Posicao inválida");

        for (int i = position; i < this.totalSize - 1; i++) {
            this._inner[i] = this._inner[i + 1];
        }

        this._inner[this.totalSize - 1] = null;
        this.totalSize--;

    }

    public boolean contains(Object o) {
        
        for (Object object : _inner) {
            if (o.equals(object))
                return true;
        }
        
        return false;
    }

    public int size() {
        return this.totalSize;
    }

    public String toString() {
        if (this._inner.length == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i <= this.totalSize - 1; i++) {
            builder.append(this._inner[i].toString());
            if (i != this.totalSize - 1)
                builder.append(", ");
        }
        builder.append("]");
        return builder.toString();
    }

    private void ensureSpace() {
        if (this.totalSize == this._inner.length) {
            Object[] newArray = new Object[this._inner.length * 2];

            for (int i = 0; i < this._inner.length; i++) {
                newArray[i] = this._inner[i];
            }
            this._inner = newArray;
        }
    }
    
}
