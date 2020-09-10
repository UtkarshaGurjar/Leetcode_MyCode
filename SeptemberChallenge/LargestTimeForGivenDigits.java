class LargestTimeForGivenDigits 
{    
    // Function to return the maximum possible time in 24-Hours format 
    public String largestTimeFromDigits(int[] A) 
    { 
        Map<Integer, Integer> timeMap = new HashMap<Integer, Integer>();
		StringBuilder timeFormat = new StringBuilder();
		boolean flag = false;
		int len = A.length;
		if (len > 4)
			return "";
		for (int i : A)
			timeMap.put(i, timeMap.getOrDefault(i, 0) + 1);
		int s = 0, res = 0;
		for (int i = 0; i < len; i++) {
			if (A[i] > 5)
				res++; // Count the Number of entries which are greater than 5.
		}
		// If I have more than 2 entries which are greater than 5 I cannot form a max
		// time starting with 2 else I can start a max time with 2.
		// Hence 's' is either 1 or 2.
		s = (res >= 2) ? 1 : 2;
		for (int i = s; i >= 0; i--) {
			if (timeMap.containsKey(i) && timeMap.get(i) > 0) {
				flag = true;
				timeFormat.append(i); // Append the first digit of the Hour with 's'
				timeMap.put(i, timeMap.get(i) - 1);
				break;
			}
		}
		if (!flag)
			return ""; // Reset the flag if the condition failed
		flag = false;
		// If the first digit of the hour starts with 2, then I'm allowed only till 3
		// for my second digit. Hence starting with 3.
		if (timeFormat.charAt(0) == '2') {
			for (int i = 3; i >= 0; i--) {
				if (timeMap.containsKey(i) && timeMap.get(i) > 0) {
					flag = true;
					timeFormat.append(i); // Append the second digit of the Hour
					timeMap.put(i, timeMap.get(i) - 1);
					break;
				}
			}
		} else { // If the first digit of the hour starts with 1 or 0, then I'm allowed only till
					// 9 for my second digit. Hence starting with 9.
			for (int i = 9; i >= 0; i--) {
				if (timeMap.containsKey(i) && timeMap.get(i) > 0) {
					flag = true;
					timeFormat.append(i);
					timeMap.put(i, timeMap.get(i) - 1);
					break;
				}
			}
		}
		if (!flag)
			return "";
		timeFormat.append(":"); // Append the colon to separate Hours and Minutes
		flag = false;
		// The max number allowed to start my first digit of the minute is 5. Hence,
		// starting with 5.
		for (int i = 5; i >= 0; i--) {
			if (timeMap.containsKey(i) && timeMap.get(i) > 0) {
				flag = true;
				timeFormat.append(i); // Append the first digit of the Minutes
				timeMap.put(i, timeMap.get(i) - 1);
				break;
			}
		}
		if (!flag)
			return "";
		flag = false;
		// The max number allowed to start my second digit of the minute is 9.
		// Hence, starting with 9.
		for (int i = 9; i >= 0; i--) {
			if (timeMap.containsKey(i) && timeMap.get(i) > 0) {
				flag = true;
				timeFormat.append(i); // Append the second digit of the Minutes
				timeMap.put(i, timeMap.get(i) - 1);
				break;
			}
		}
		if (!flag)
			return "";
		return timeFormat.toString(); // Final time
    } 
  
    
}