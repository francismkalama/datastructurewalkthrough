package org.example.datastructure;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TheSetCollection {
    public static void main(String [] args) {
        Set<Company> setCompany = new HashSet<>();
        setCompany.add(new Company("Cocacola"));
        setCompany.add(new Company("BAT"));
        setCompany.add(new Company("Cocacola"));
        setCompany.add(new Company("Cocacola"));
        System.out.println(setCompany.size());
        setCompany.forEach(System.out::println);
    }
    static class Company{
        String companyName;

        public Company(String companyName) {
            this.companyName = companyName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Company company = (Company) o;
            return Objects.equals(companyName, company.companyName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(companyName);
        }

        @Override
        public String toString() {
            return "Company{" +
                    "companyName='" + companyName + '\'' +
                    '}';
        }
    }
}

