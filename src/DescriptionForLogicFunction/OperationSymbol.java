/*
 * �������
 */
package DescriptionForLogicFunction;
public class OperationSymbol {  
/*************�����߼���*****************/
	public static int and(int a,int b) {  //ͬ
		if(a==1&&b==1) return 1;
		else return 0;
	}
	public static int or(int a,int b) { //��
		if(a==0&&b==0) return 0;
		else return 1;
	}
	public static int not(int a) { //��
		if(a==1) return 0;
		else return 1;
	}
		
/**************��������߼���*************/
	public static int nand(int a,int b) { //���
		return not(and(a,b));
	}
	public static int nor(int a,int b) { //���
		return not(or(a,b));
	}
	public static int AndNor(int a,int b,int c,int d) { //����
		return not(or(and(a,b),and(c,d)));
	}
	public static int ExclusiveOr(int a,int b) { //���
		//return or(and(a,not(b)),and(not(a),b));  ���ڲ��߼����������ʾ��ȱ���ǱȽϸ���
		if(a==b) return 0;   //������ֵ�����ʣ���ͬ��0����ͬ��1
		else return 1;
	}
	public static int ExclusiveNor(int a,int b) {  //ͬ��
		//return or(and(a,b),and(not(a),not(b));
		if(a==b) return 1;
		else return 0;
	}
	
/**************�м�������ǿ�߼���*************/
/*
 * ����������һ������������ʽ���ڵ�������Ϣ��һ����ģʽѡ��
 * and�������������
 * or��  ����������
 */
	public static int many(int inputtemp[],String choose) {
		int many=inputtemp[0];
		for(int i=1;i<inputtemp.length;i++) {
			switch(choose) {
				case("and"): many= and(inputtemp[i],many);break;
				case("or"): many = or(inputtemp[i],many);break;
				default : many=-1;  //������ʾ
			}
		}
		if(many==-1) System.out.println("û����һ��");
		return many;
	}
	
	public static void main(String args[]) {
		int input []=new int[3];
		input[0]=0;
		input[1]=1;
		input[2]=1;
		System.out.println(many(input,"and"));
	}
/**************��չ�߼���*****************/
/*
 * transform gate ������
 * ֻ���������ƶ˷���C=1��C'=0
 * ���ݲŻᱭ�����䵽�����
 */
	public static int TG(int input,int controlOne,int controlTwoNor) {
		int output=0;
		if(controlOne==1&&controlTwoNor==0) {
			output = input;
		}
		return output;
	}
}
