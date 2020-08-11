package cl.crisgvera.ensayouno.controller;

import cl.crisgvera.ensayouno.dto.BeneficiarioAyudaDTO;
import cl.crisgvera.ensayouno.model.Ayuda;
import cl.crisgvera.ensayouno.model.Beneficiario;
import cl.crisgvera.ensayouno.service.AyudaService;
import cl.crisgvera.ensayouno.service.BeneficiarioService;
import cl.crisgvera.ensayouno.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private BeneficiarioService beneficiarioService;

    @Autowired
    private CiudadService ciudadService;

    @Autowired
    private AyudaService ayudaService;

    @GetMapping("")
    public String index(Model model) {
        // Simulación de consumo REST desde el lado del servidor (?)
        model.addAttribute("beneficiarioDTO", new BeneficiarioAyudaDTO());
        model.addAttribute("beneficiarios", beneficiarioService.getAll());
        model.addAttribute("ciudadDetalle", ciudadService.getCiudadDetalle());
        return "index";
    }

    @Transactional
    @PostMapping("/agregar-ayuda")
    public String agregarAyuda(@ModelAttribute("beneficiarioAyuda") BeneficiarioAyudaDTO beneficiarioAyudaDTO) {
        Beneficiario beneficiario = beneficiarioService.getOne(beneficiarioAyudaDTO.getBeneficiarioid());
        Ayuda ayuda = beneficiarioAyudaDTO.getAyuda();
        beneficiario.addAyuda(ayuda);
        ayudaService.save(ayuda);
        return "redirect:/";
    }
}
