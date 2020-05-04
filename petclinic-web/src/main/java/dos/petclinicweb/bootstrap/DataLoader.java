package dos.petclinicweb.bootstrap;

import dos.petclinicdata.model.Owner;
import dos.petclinicdata.model.Vet;
import dos.petclinicdata.services.OwnerService;
import dos.petclinicdata.services.VetService;
import dos.petclinicdata.services.map.OwnerServiceMap;
import dos.petclinicdata.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Micha");
        owner2.setLastName("Preston");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Robert");
        vet1.setLastName("Polanski");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Roberta");
        vet2.setLastName("Politano");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
