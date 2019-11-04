package com.hcl.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StockController {
	
	@Autowired
	 StockService stockService;
	@Autowired
   	 StockRepository stockRepository;
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PlacedOrderRepository placedOrderRepository;
	
	@RequestMapping("/")
	public ModelAndView getHomePage() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("HomePage");
		return mv;
	}
	
	@RequestMapping("/viewAllStocks")
	public ModelAndView getAllStocks() {
		ModelAndView mv=new ModelAndView();
		List<Stock> stock=(List<Stock>)stockRepository.findAll(); 
		mv.addObject("stockList",stock);
		mv.setViewName("ViewAllStock");
		return mv;
	}
	
	@RequestMapping("/BuyStock")
	public ModelAndView regUser() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Reg");
		return mv;
	}
	
	
	@RequestMapping("/StockList")
	public ModelAndView buyStocks(@ModelAttribute User user) {
		ModelAndView mv= new ModelAndView();
		userRepository.save(user);
		List<Stock> stock=(List<Stock>)stockRepository.findAll(); 
		mv.addObject("stockList",stock);
		mv.setViewName("PlaceOrder");
		return mv;
	}
	
//	@RequestMapping("/viewMyStocks/{stockId}")
//	  public ModelAndView viewMyStocks(@PathVariable ("stockId") int stockId ,@ModelAttribute PlacedOrder stocks) {
//		ModelAndView mv=new ModelAndView();
//		placedOrderRepository.save(stocks);
//		Optional<PlacedOrder> order=(Optional<PlacedOrder>)placedOrderRepository.findById(stockId);
//	
//		
//		return null;
		
	@RequestMapping("/ToQty/{id}")
	public ModelAndView viewMyStocks(@PathVariable int id ) {
		ModelAndView mv= new ModelAndView();
		Stock stock=new Stock();
		stock=stockRepository.findById(id).get();
		mv.addObject("stock",stock);
		mv.addObject("qtyAvail",stock.getQuantity());
		stock.setQuantity(0);
		mv.setViewName("ViewMyStock");
		return mv;
	
	
}

	
	

 


	
	
 }


