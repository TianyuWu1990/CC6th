//package CC4_12_PATHS_WITH_SUM;
//
//import CtCILibrary.CtCILibrary.AssortedMethods;
//import CtCILibrary.CtCILibrary.TreeNode;
//
//public class Tester {
//
//	public static void main(String[] args) {
//		boolean isWorking = true;
//		while (isWorking) {
//			int min = -20;
//			int max = 20;
//			int size = 20;
//			TreeNode root = AssortedMethods.randomBST(size, min, max);
//
//			for (int targetSum = Math.min(-1, min * size - 10); targetSum <= Math.max(100, max * size + 10); targetSum++) {
//				int answerA = BRUTE_FORCE.countPathsWithSum(root, targetSum);
//				int answerB = LEVEL_BY_LEVEL.countPathsWithSum(root, targetSum);
//				if (answerA > 0 || answerB > 0) {
//					System.out.println(targetSum + ": " + answerA + ", " + answerB + " | " + (answerA == answerB));
//				}
//				if (answerA != answerB) {
//					isWorking = false;
//					break;
//				}
//			}
//		}
//	}
//
//}
