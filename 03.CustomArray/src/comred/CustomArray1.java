package comred;

public class CustomArray1 {

	private int size = 0;
	private String[] items = new String[3];

	public void add(String data) {
		// size 3 length 4
		if (size < items.length) {
			items[size++] = data;

		} else {// number needs to bigger adding 1 which is to small so we multiple by 2 which
				// reduce the amount of
			String[] temp = new String[items.length * 2];

			for (int i = 0; i < items.length; i++) {

				temp[i] = items[i];
			}

			items = temp;
			add(data);
		}
	}

	public String[] findAll() {
		String[] temp = new String[size - 1];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = items[i];
		}

		return temp;

	}

	public void inserts(String... items) {
		for (String data : items) {
			this.add(data);

		}

	}

	public void delete(String data) {
		String[] temp = new String[size];
		
		int index = 0;

		for (int i = 0; i < temp.length; i++) {
			if (!items[i].equals(data)) {
				temp[index++] = items[i];

			}

			
			size = size - (size - index);
			items = temp;
		}

	}

}
