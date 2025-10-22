package com.klu.ecommerce; // Keep your existing test package

import com.klu.carrental.CarrentalApplication; // ⬅️ IMPORT YOUR MAIN CLASS
import org.springframework.boot.test.context.SpringBootTest;

// ⬅️ EXPLICITLY DECLARE THE MAIN CONFIGURATION CLASS
@SpringBootTest(classes = CarrentalApplication.class) 
class EcommerceApplicationTests {
    // ... test methods
}