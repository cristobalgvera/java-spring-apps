package cl.crisgvera.ensayouno.resource;

import cl.crisgvera.ensayouno.model.rest.BeneficiarioRest;
import cl.crisgvera.ensayouno.service.BeneficiarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beneficiarios")
public class BeneficiarioResource {
    // TODO: it's a good practice call a REST controller inside your own app? I don't think so

    @Autowired
    private BeneficiarioService beneficiarioService;

    @GetMapping
    public BeneficiarioRest getBeneficiarios() {
        return new BeneficiarioRest(beneficiarioService.getAll());
    }
}
