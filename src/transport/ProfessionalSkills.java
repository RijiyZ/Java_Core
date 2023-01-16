package transport;

public enum ProfessionalSkills {
    PROFESSIONAL_SKILLS_OF_WORKING_WITH_BUSES("Автобусы"),
    PROFESSIONAL_SKILLS_OF_WORKING_WITH_CARS("Легковые авто"),
    PROFESSIONAL_SKILLS_OF_WORKING_WITH_TRUCKS("Грузовики"),
    PROFESSIONAL_SKILLS_OF_WORKING_WITH_ALL_TRANSPORT("Любой транспорт");
    private final String ProfessionalSkills;

    ProfessionalSkills(String professionalSkills) {
        ProfessionalSkills = professionalSkills;
    }

    public String getProfessionalSkills() {
        return ProfessionalSkills;
    }

    @Override
    public String toString() {
        return ProfessionalSkills;
    }
}
