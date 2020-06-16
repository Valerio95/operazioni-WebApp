package it.dstech.formazione.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.gestione.Gestione;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping(value  = "/sceltaOperazione" ,method = RequestMethod.GET)
	public ModelAndView sceltaOperazione(@RequestParam("operazioneScelta") String operazione, Model model) {
		 
		return new ModelAndView("operazione", "operazioneScelta", operazione);
	}
	
	@RequestMapping(value  = "/eseguiOperazione", method = RequestMethod.POST)
	public ModelAndView eseguiOperazione(@RequestParam("operazione") String operazione, Model model, @RequestParam("Primo numero")int primoNumero,@RequestParam("Secondo numero")int secondoNumero) {
		 Gestione gestione = new Gestione();
		 int risultato=0;
		if(operazione.equalsIgnoreCase("addizione")) {
		risultato=	gestione.addizione(primoNumero, secondoNumero);
		}else if(operazione.equalsIgnoreCase("sottrazione")) {
			risultato=	gestione.sottrazione(primoNumero, secondoNumero);
			}else if(operazione.equalsIgnoreCase("moltiplicazione")) {
				risultato=	gestione.moltiplicazione(primoNumero, secondoNumero);
			}else if(operazione.equalsIgnoreCase("divisione")) {
				 risultato=	gestione.divisione(primoNumero, secondoNumero);
			}
		
		
		return new ModelAndView("risultato", "risultato", risultato);
	}
}
