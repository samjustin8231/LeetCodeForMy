package leetcode.easy.easy;

import java.util.HashMap;
import java.util.Map;

public class Max_points_on_a_line {

	class Point {
		int x;
		int y;

		Point() {
			x = 0;
			y = 0;
		}

		Point(int a, int b) {
			x = a;
			y = b;
		}
	}

	public static void main(String[] args) {
		
	}


	public int maxPoints(Point[] points) {
		if (points.length < 3)
			return points.length;

		int max = 0;// ���ڷ��صĽ���������ߵ��������
		Map<Double, Integer> map = new HashMap<Double, Integer>();// ����ͬһ��б�ʵĵ�ĸ���

		for (int i = 0; i < points.length; i++) {// ��ÿһ����Ϊ�̶���
			map.clear();
			int duplicate = 1;// ��¼���̶����غϵĸ���

			for (int j = 0; j < points.length; j++) {// ���������㣬������̶���֮���б��
				if (i == j)
					continue;// ������Լ�������
				double slope = 0.0;// б��

				if (points[i].x == points[j].x && points[i].y == points[j].y) {// ������̶����غ�
					duplicate++;
					continue;
				} else if (points[i].x == points[j].x) {// ������̶�����ͬһ�������ϣ�б����Ϊ���ֵ
					slope = Integer.MAX_VALUE;
				} else {// ����õ���̶����б��
					slope = 1.0 * (points[i].y - points[j].y)
							/ (points[i].x - points[j].x);
				}
				map.put(slope, map.containsKey(slope) ? map.get(slope) + 1 : 1);
			}

			// �������Ž�
			if (map.keySet().size() == 0) {// ���mapΪ��
				max = duplicate > max ? duplicate : max;
			} else {
				for (double key : map.keySet()) {
					max = Math.max((duplicate + map.get(key)), max);
				}
			}
		}
		return max;
	}
}
