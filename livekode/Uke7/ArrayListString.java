class ArrayListString {
	private int size;
	private String[] data;

	ArrayListString() {
		size = 0;
		data = new String[10];
	}

	ArrayListString(int maxSize) {
		size = 0;
		data = new String[maxSize];
	}

	int size() {
		return size;
	}

	void add(String element) {
		data[size] = element;
		size++;
	}

	void add(int index, String element) {
		for (int i = size; i > index; i--) {
			data[i] = data[i - 1];
		}
		data[index] = element;
		size++;
	}

	String get(int index) {
		return data[index];
	}

	void set(int index, String element) {
		data[index] = element;
	}

	void remove(int index) {
		for (int i = index + 1; i < size; i++) {
			data[i - 1] = data[i];
		}
		size--;
	}

	void remove(String element) {
		int index = indexOf(element);
		if (index >= 0) {
			remove(indexOf(element));
		}
	}

	boolean contains(String element) {
		return indexOf(element) >= 0;
	}

	int indexOf(String element) {
		for (int i = 0; i < size; i++) {
			if (data[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}

	public String toString() {
		String resultat = "[";
		for (int i = 0; i < size; i++) {
			resultat += data[i];
			if (i < size - 1) {
				resultat += ", ";
			}
		}
		resultat += "]";
		return resultat;
	}
}