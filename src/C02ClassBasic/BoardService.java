package C02ClassBasic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) throws IOException {
        List<List<Author>> authorList = new ArrayList<>();
        List<List<Post>> postList= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //회원가입
//        Author a1 = new Author("이준서","lee@naver.com","1234");
//        authorList.get(0).add(a1);
//        for(int i = 0; i<authorList.size(); i++) System.out.println(authorList.get(i));
//        System.out.println(authorList.get(0).getPassword());
//        for(Author a : authorList) System.out.println(a.getName()+ a.getEmail()+ a.getPassword());
        //회원가입
        while(true) {
        System.out.println("선택하십시오");
        System.out.println("1.회원가입, 2.회원전체목록조회, 3.회원 상세조회");
        String input = sc.nextLine();
        for(int i =0; i<i+2; i++){
        if (input.equals("1")) {
                authorList = new ArrayList<>();
                System.out.println("이름입력");
                String n = sc.nextLine();
                System.out.println("이메일입력");
                String e = sc.nextLine();
                System.out.println("비밀번호입력");
                String pw = sc.nextLine();
                Author A = new Author(n, e, pw);
//                authorList.add(A);
            }
        else if (input.equals("2")) {
            System.out.println("회원전체목록 조회입니다.");
            for(Author A: authorList.get(i)){
                System.out.println(A);
            }
        }
        }}



//        System.out.println("이름입력");
//        String n = sc.nextLine();
//        System.out.println("이메일입력");
//        String e = sc.nextLine();
//        System.out.println("비밀번호입력");
//        String pw = sc.nextLine();
//        Author A = new Author(n,e,pw);
//        authorList.get(0).add(A);
//        System.out.println();
//        System.out.println(A.getName()+ A.getEmail()+ A.getPassword());




//        1.회원가입 : 이름, 이메일, 비밀번호, id값(author_increment)
//        2.회원 전체 목록 조회 : id  email
//        3.회원 상세조회(id로 조회) : id, email, name, password, 작성글수
//        4.게시글 작성 : id(post), 제목, 내용, 작성자email -> author_id를 찾아서 author_id로 변경입력,id값(auto)
//        5.게시글 목록조회 : id(post), title
//        6.게시글 상세조회(id(post)로 조회) : id(post), title, contents, 작성자email
//        7.서비스 종료





    }
}
//        1.회원가입 : 이름, 이메일, 비밀번호, id값(author_increment)
//        2.회원 전체 목록 조회 : id  email
//        3.회원 상세조회(id로 조회) : id, email, name, password, 작성글수
class Author{
    static long static_id;
    private long id;
    private String name;
    private String email;
    private String password;
    public Author(String name, String email, String password) {
        static_id++;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public void ddd(){
        this.id = static_id;
    }



    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
}

//        4.게시글 작성 : id(post), 제목, 내용, 작성자email -> author_id를 찾아서 author_id로 변경입력,id값(auto)
//        5.게시글 목록조회 : id(post), title
//        6.게시글 상세조회(id로 조회) : id(post), title, contents, 작성자email
class Post{
    static long static_id;
    private long id;
    private String title;
    private String contents;
    public Post(long id, String title, String contents) {
        static_id++;
        this.id = static_id;
        this.title = title;
        this.contents = contents;
    }
}
