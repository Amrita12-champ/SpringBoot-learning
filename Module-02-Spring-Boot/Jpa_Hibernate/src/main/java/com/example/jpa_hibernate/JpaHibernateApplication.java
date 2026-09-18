package com.example.jpa_hibernate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JpaHibernateApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JpaHibernateApplication.class, args);
        com.example.Jpa_Hibernate.DeveloperRepo devRepo = context.getBean(com.example.Jpa_Hibernate.DeveloperRepo.class);

        // 1. Create Domain
        Domain d1 = new Domain();
        d1.setId(501);
        d1.setName("Software Technology");

        // 2. Create Projects and link with Domain
        Project p1 = new Project();
        p1.setId(901);
        p1.setTitle("Agri-Tech");
        p1.setDomain(d1);

        Project p2 = new Project();
        p2.setId(902);
        p2.setTitle("rox-Code");
        p2.setDomain(d1);

        List<Project> domainProjects = new ArrayList<>();
        domainProjects.add(p1);
        domainProjects.add(p2);
        d1.setProjects(domainProjects);

        // 3. Create Developer and establish relationships
        Developer dev = new Developer();
        dev.setId(43);
        dev.setName("Amrita");
        dev.setDomain(d1);

        List<Project> devProjects = new ArrayList<>();
        devProjects.add(p1);
        devProjects.add(p2);
        dev.setProjects(devProjects);

        // 4. Save Developer (cascades automatically to Domain, Project, and Join Table)
        devRepo.save(dev);
        System.out.println("\nAll entities and mappings saved successfully!");

        // 5. Verification
        Optional<Developer> optionalDev = devRepo.findById(101);
        if (optionalDev.isPresent()) {
            Developer fetched = optionalDev.get();
            System.out.println("Developer Name: " + fetched.getName() + " (ID: " + fetched.getId() + ")");
            System.out.println("  -> [One-to-One] Domain: " + fetched.getDomain().getName());
            System.out.println("  -> [Many-to-Many] Projects Assigned: " + fetched.getProjects().size());
            System.out.println("  -> [One-to-Many via Domain] Domain's Projects: " + fetched.getDomain().getProjects().size());
        }
    }
}