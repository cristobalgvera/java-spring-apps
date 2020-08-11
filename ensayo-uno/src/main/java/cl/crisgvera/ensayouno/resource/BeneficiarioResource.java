package cl.crisgvera.ensayouno.resource;

import cl.crisgvera.ensayouno.model.Beneficiario;
import cl.crisgvera.ensayouno.service.BeneficiarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/beneficiario")
public class BeneficiarioResource {
    // TODO: it's a good practice call a REST controller inside your own app? I don't think so

    @Autowired
    private BeneficiarioService beneficiarioService;

    @GetMapping("/solicitar-ayuda")
    public Collection<Beneficiario> getBeneficiarios() {
        return beneficiarioService.getAll();
    }
}
