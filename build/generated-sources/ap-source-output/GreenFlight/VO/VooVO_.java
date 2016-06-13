package GreenFlight.VO;

import GreenFlight.VO.AeroportoVO;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T17:22:20")
@StaticMetamodel(VooVO.class)
public class VooVO_ { 

    public static volatile SingularAttribute<VooVO, Date> _DataViagem;
    public static volatile SingularAttribute<VooVO, AeroportoVO> _AeroportoDestino;
    public static volatile SingularAttribute<VooVO, Long> _CodigoVoo;
    public static volatile SingularAttribute<VooVO, AeroportoVO> _AeroportoOrigem;

}