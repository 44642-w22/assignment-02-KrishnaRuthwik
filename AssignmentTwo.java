package Assignment_02;

import java.util.*;


	public class AssignmentTwo {
		
			
			public static void main(String[] args) {		
				problem_One();
				problem_Two();
				problem_Three();
				problem_Four();
				problem_Five();
				problem_Six();
			}
			
			public static void problem_One() {
				// TODO Auto-generated method stub
				System.out.println("*------ Problem One ------*");
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter No of Strings: ");
				int n = sc.nextInt();
				String[] arr = new String[n];
				System.out.println("Enter " + n + " Strings: ");

				for (int i = 0; i < n; i++) {
					String s = sc.next();
					arr[i] = s;
				}

				Map<String, Integer> resultult = countStrings(arr);
				System.out.print("Input (S1): [");
				int count = 0;
				for (int i = 0; i < arr.length; i++) {
					count++;
					if (count != arr.length)
						System.out.print("\"" + arr[i] + "\",");
					else
						System.out.print("\"" + arr[i] + "\"");
				}
				System.out.println("]");
				System.out.println("Output: ");
				count = 0;
				for (Map.Entry<String, Integer> entry : resultult.entrySet()) {
					count++;
					if (count != resultult.size()) {
						System.out.print(entry.getKey() + "-" + entry.getValue() + ", ");
					} else {
						System.out.print(entry.getKey() + "-" + entry.getValue());
					}
				}
			}

			public static Map<String, Integer> countStrings(String[] input) {
				Map<String, Integer> map = new HashMap<>();

				for (int i = 0; i < input.length; i++) {
					map.put(input[i], map.getOrDefault(input[i], 0) + 1);
				}
				return map;

			}	
			
			public static void problem_Two() {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);

				System.out.println("\n** -------Problem Two-------------**");
				System.out.print("Enter Number of Strings: ");
				int n = sc.nextInt();
				String[] arr = new String[n];
				System.out.println("Enter " + n + " Strings: ");

				for (int i = 0; i < n; i++) {
					String s = sc.next();
					arr[i] = s;

				}

				Map<String, String> result = concatStrings(arr);
				System.out.print("Input (S1): [");
				int count = 0;
				for (int i = 0; i < arr.length; i++) {
					count++;
					if (count != arr.length)
						System.out.print("\"" + arr[i] + "\",");
					else
						System.out.print("\"" + arr[i] + "\"");
				}
				System.out.println("]");
				System.out.println("Output (M1): {");
				count = 0;
				for (Map.Entry<String, String> entry : result.entrySet()) {
					count++;
					if (count != result.size())
						System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"" + ",");
					else
						System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"");

				}
				System.out.print("}");
			}

			public static Map<String, String> concatStrings(String[] input) {
				Map<String, String> map = new HashMap<>();
				for (int i = 0; i < input.length; i++) {
					String s = input[i];
					map.put(s.charAt(0) + "", map.getOrDefault(s.charAt(0) + "", "") + s);
				}

				return map;
			}
			
//			Question 3
			public static void problem_Three() {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);

				System.out.println("\n**---------Problem Three-----**");
				System.out.print("Enter Number of Elements: ");
				int n = sc.nextInt();
				int[] arr = new int[n];
				System.out.println("Enter " + n + " Elements: ");

				for (int i = 0; i < n; i++) {
					int ele = sc.nextInt();
					arr[i] = ele;

				}

				Set<Integer> result = printSequentialSet(arr);
				System.out.println("Input (A1): " + Arrays.toString(arr));
				System.out.println("Output (S): " + result);
			}

			public static Set<Integer> printSequentialSet(int[] input) {
				Set<Integer> set = new LinkedHashSet<>();
				for (int i = 0; i < input.length; i++) {
					int ele = input[i];
					while (set.contains(ele)) {
						ele++;
					}
					set.add(ele);
				}
				return set;
			}

		//Question 4

		public static void problem_Four() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);

			System.out.println("\n**---------- Problem Four ----------- **");
			System.out.print("Enter number of Strings: ");
			int n = sc.nextInt();
			ArrayList<String> input = new ArrayList<>();
			System.out.println("Enter " + n + " Elements: ");

			for (int i = 0; i < n; i++) {
				String ele = sc.next();
				input.add(ele);

			}

			ArrayList<String> result = removeDuplicateChars(input);
			System.out.print("Input (A1): [");
			int count = 0;
			for (int i = 0; i < input.size(); i++) {
				count++;
				if (count != input.size())
					System.out.print("\"" + input.get(i) + "\",");
				else
					System.out.print("\"" + input.get(i) + "\"");
			}
			System.out.println("]");

			System.out.println("Output (A2): [");
			count = 0;
			for (int i = 0; i < result.size(); i++) {
				count++;
				if (count != result.size())
					System.out.print("\"" + result.get(i) + "\",");
				else
					System.out.print("\"" + result.get(i) + "\"");
			}
			System.out.println("]");
			// System.out.println(result);

		}

		public static ArrayList<String> removeDuplicateChars(ArrayList<String> input) {
			ArrayList<String> result = new ArrayList<>();
			Set<Character> set = new HashSet<>();

			for (int i = 0; i < input.size(); i++) {
				String s = input.get(i);
				StringBuilder sb = new StringBuilder();
				for (char c : s.toCharArray()) {
					if (!set.contains(c)) {
						sb.append(c);
						set.add(c);
					}
				}
				result.add(sb.toString());

				set.clear();
			}
			return result;
		}


		public static void problem_Five() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\n** ------Problem Five ------**");
			System.out.print("Enter Number of Strings: ");
			int n = sc.nextInt();
			ArrayList<String> input = new ArrayList<>();
			System.out.println("Enter " + n + " elements: ");

			for (int i = 0; i < n; i++) {
				String ele = sc.next();
				input.add(ele);

			}

			Map<String, String> result = firstLastCharMap(input);
			System.out.print("Input: [");
			int count = 0;
			for (int i = 0; i < input.size(); i++) {
				count++;
				if (count != input.size())
					System.out.print("\"" + input.get(i) + "\",");
				else
					System.out.print("\"" + input.get(i) + "\"");
			}
			System.out.println("]");

			System.out.println("Output: {");
			count = 0;
			for (Map.Entry<String, String> entry : result.entrySet()) {
				count++;
				if (count != result.size())
					System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"" + ",");
				else
					System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"");

			}
			System.out.print("}");
		}

		public static Map<String, String> firstLastCharMap(ArrayList<String> input) {
			Map<String, String> map = new HashMap<>();
			for (int i = 0; i < input.size(); i++) {
				char firstChar = input.get(i).charAt(0);
				char lastChar = input.get(i).charAt(input.get(i).length() - 1);
				map.put(firstChar + "", lastChar + "");
			}
			return map;

		}

		public static void problem_Six() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);

			System.out.println("\n** ------------Problem Six ------------**");
			System.out.print("Enter Number of Strings: ");
			int n = sc.nextInt();
			ArrayList<String> input = new ArrayList<>();
			System.out.println("Enter " + n + " Elements: ");

			for (int i = 0; i < n; i++) {
				String ele = sc.next();
				input.add(ele);

			}

			Map<String, Boolean> result = setBooleanMap(input);
			System.out.print("Input (S1): [");
			int count = 0;
			for (int i = 0; i < input.size(); i++) {
				count++;
				if (count != input.size())
					System.out.print("\"" + input.get(i) + "\",");
				else
					System.out.print("\"" + input.get(i) + "\"");
			}
			System.out.println("]");

			System.out.println("Output (M1): {");
			count = 0;
			for (Map.Entry<String, Boolean> entry : result.entrySet()) {
				count++;
				if (count != result.size())
					System.out.print("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + ", ");
				else
					System.out.print("\"" + entry.getKey() + "\"" + ":" + entry.getValue());

			}
			System.out.print("}");
		}

		public static Map<String, Boolean> setBooleanMap(ArrayList<String> input) {

			Map<String, Boolean> map = new HashMap<>();
			for (int i = 0; i < input.size(); i++) {
				if (map.containsKey(input.get(i))) {
					map.put(input.get(i), true);
				} else {
					map.put(input.get(i), false);
				}
			}
			return map;
		}

	}
