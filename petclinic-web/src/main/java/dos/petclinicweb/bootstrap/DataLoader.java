package dos.petclinicweb.bootstrap;

import dos.petclinicdata.model.Owner;
import dos.petclinicdata.model.Vet;
import dos.petclinicdata.services.OwnerService;
import dos.petclinicdata.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Micha");
        owner2.setLastName("Preston");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Robert");
        vet1.setLastName("Polanski");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Roberta");
        vet2.setLastName("Politano");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
