package String;
/*
�׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. ���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, 
kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.
�ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 
 * 
ù° �ٿ� �ܾ��� ���� N�� ���´�. N�� 100���� �۰ų� ���� �ڿ����̴�. 
��° �ٺ��� N���� �ٿ� �ܾ ���´�. �ܾ�� ���ĺ� �ҹ��ڷθ� �Ǿ��ְ� �ߺ����� ������, ���̴� �ִ� 100�̴�.
 * 
ù° �ٿ� �׷� �ܾ��� ������ ����Ѵ�. 
 * 
 * 
3
happy
new
year
-----
3
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class checker_9 {
	public static void main(String[] args) throws IOException {
		// �տ� ���Զ� �ܾ ������ �ȵǴ°�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		String[] array = new String[testcase];
		for (int i = 0; i < testcase; i++) {
			array[i] = br.readLine();
		}

		// ���ӵ� �ܾ�� �����ϰ�, �� ������ ���ĺ��� ��� ó���ҰŴ� -> ó���� ���� �˷��� boolean���� ������ ���ڴ�
		// int count = 0;

		/*
		 * xx:for(int i=0; i<array.length; i++) { //�׽�Ʈ���̽���ŭ ���ž�.
		 * HashMap<String,Integer> map = new HashMap<String, Integer>(); //boolean check
		 * = true; String[] alpha = new String[array[i].length()]; int temp=0; String[]
		 * array2 = array[i].split(""); Integer[] temp2 = new Integer[100];
		 * ArrayList<Integer> temp3 = new ArrayList<Integer>(); for(int j=0;
		 * j<array2.length-1; j++) { // if(array2[j].equals(array2[j-1])){ //
		 * map.put(array2[j-1], 1); // } // if(map.containsKey(array2[j])) { // //check
		 * = false; // break xx; // } // if(!map.containsKey(array2[j])) { //
		 * if(!array2[j].equals(array2[j+1])){ // map.put(array2[j], 0); // }else { //
		 * map.put(array2[j], 1); // } // }else { // if(!array2[j].equals(array2[j+1])){
		 * // map.put(array2[j], 0); // } // } if(!map.containsKey(array2[j])) {
		 * if(!array2[j].equals(array2[j+1])){ map.put(array2[j], 0); }else {
		 * temp3.add(1); //���ӵ� ���� ����. } }else { if(!array2[j].equals(array2[j+1])){
		 * map.put(array2[j], 0); }else { temp3.add(1); } } } count++; }
		 * 
		 */
		int result = 0; // �� ����

		xx: for (int i = 0; i < array.length; i++) { // �׽�Ʈ���̽���ŭ ���ž�.
			// int[] alpha = new int[array[i].length()];
			int[] alpha = new int[26];
			String[] temp = new String[array[i].length()];

			// �ּұ��̰� 3�̻��� �Ǿ�� �׷쿡 �̻��� ����. ��, ���̰� 3���ϴ� ������ �׷�.
			if (array[i].length() > 2) {
				temp = array[i].split("");
				alpha[(int)temp[0].charAt(0)-97]++;
				for (int j = 0; j < temp.length - 1; j++) {

					// ���̶� �ڶ� �ٸ��� �̹� ���ڸ��� ä���� ���� ��
					char front = temp[j].charAt(0);
					char back = temp[j+1].charAt(0);
					if (!temp[j + 1].equals(temp[j]) && alpha[(int) back - 97] != 0) {
						continue xx;
					}
					alpha[(int) front - 97]++; // �ش� ���ĺ��ڸ��� �� ����.
				}

			} else {
				result++;
				continue xx;
			}

			// �ɸ��°� ������ ����.
			result++;

		}

		System.out.println(result);

	}
}
