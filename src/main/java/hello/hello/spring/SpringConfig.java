package hello.hello.spring;

import hello.hello.spring.aop.TimeTraceAop;
import hello.hello.spring.repository.JpaMemberRepository;
import hello.hello.spring.repository.MemberRepository;
import hello.hello.spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    /*private final DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }
*/
    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

    /*
    @Bean
    public MemberRepository memberRepository(){

        //return new MemoryMemberRepository();
        //return new JdbcMemberRepositroy(dataSource);
        //return new JdbcTemplateMemberRepository(dataSource);
        return new JpaMemberRepository(em);
    }
     */
}
