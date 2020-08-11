package cl.crisgvera.ensayouno.dto;

import cl.crisgvera.ensayouno.model.Ayuda;
import lombok.Data;

@Data
public class BeneficiarioAyudaDTO {
    private Long beneficiarioid;
    private Ayuda ayuda;
}
