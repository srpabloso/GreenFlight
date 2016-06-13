package GreenFlight.VO;

import GreenFlight.VO.ClienteVO;
import GreenFlight.VO.VooVO;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T17:22:20")
@StaticMetamodel(PassagemVO.class)
public class PassagemVO_ { 

    public static volatile SingularAttribute<PassagemVO, Integer> _Assento;
    public static volatile SingularAttribute<PassagemVO, Double> _Desconto;
    public static volatile SingularAttribute<PassagemVO, ClienteVO> _Cliente;
    public static volatile SingularAttribute<PassagemVO, Double> _ValorTotal;
    public static volatile SingularAttribute<PassagemVO, Double> _Preco;
    public static volatile SingularAttribute<PassagemVO, Long> _CodigoPassagem;
    public static volatile SingularAttribute<PassagemVO, VooVO> _Voo;

}