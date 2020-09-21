package com.journals.iomcworld.model;

import java.util.List;

public class CategoryResponse {


    /**
     * status : true
     * journals_cnt : 27
     * journal_details : [{"flyerimg":"https://www.iomcworld.org/admin/flyers/jbtw-flyer.jpg","home_url":"https://www.iomcworld.org/biology-todays-world.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/biology-todays-world/editorial-board.html","ci_url":"https://www.iomcworld.org/biology-todays-world/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/biology-todays-world.html","journal":"jbtw","managejournal":"Journal of Biology and Today's World"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/jhar-flyer.jpg","home_url":"https://www.iomcworld.org/hiv-aids-research.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/hiv-aids-research/editorial-board.html","ci_url":"https://www.iomcworld.org/hiv-aids-research/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/hiv-aids-research.html","journal":"jhar","managejournal":"Journal of HIV and AIDS Research"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/ejco-flyer.jpg","home_url":"https://www.iomcworld.org/european-clinical-oncology.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/european-clinical-oncology/editorial-board.html","ci_url":"https://www.iomcworld.org/european-clinical-oncology/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/european-clinical-oncology.html","journal":"ejco","managejournal":"European Journal of Clinical Oncology"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/jdrp-flyer.jpg","home_url":"https://www.iomcworld.org/dental-research-practice.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/dental-research-practice/editorial-board.html","ci_url":"https://www.iomcworld.org/dental-research-practice/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/dental-research-practice.html","journal":"jdrp","managejournal":"Journal of Dental Research and Practice"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/jpsdd-flyer.jpg","home_url":"https://www.iomcworld.org/pharmaceutical-sciences-drug-development.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/pharmaceutical-sciences-drug-development/editorial-board.html","ci_url":"https://www.iomcworld.org/pharmaceutical-sciences-drug-development/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/pharmaceutical-sciences-drug-development.html","journal":"jpsdd","managejournal":"Journal of Pharmaceutical Sciences and Drug Development"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/nnr-flyer.jpg","home_url":"https://www.iomcworld.org/neurology-neurorehabilitation.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/neurology-neurorehabilitation/editorial-board.html","ci_url":"https://www.iomcworld.org/neurology-neurorehabilitation/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/neurology-neurorehabilitation.html","journal":"nnr","managejournal":"Neurology and Neurorehabilitation"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/jhmr-flyer.jpg","home_url":"https://www.iomcworld.org/health-medical-research.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/health-medical-research/editorial-board.html","ci_url":"https://www.iomcworld.org/health-medical-research/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/health-medical-research.html","journal":"jhmr","managejournal":"Journal of Health and Medical Research"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/jmbi-flyer.jpg","home_url":"https://www.iomcworld.org/microbiology-immunology.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/microbiology-immunology/editorial-board.html","ci_url":"https://www.iomcworld.org/microbiology-immunology/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/microbiology-immunology.html","journal":"jmbi","managejournal":"Journal of Microbiology and Immunology"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/jcnp-flyer.jpg","home_url":"https://www.iomcworld.org/clinical-nursing-practice.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/clinical-nursing-practice/editorial-board.html","ci_url":"https://www.iomcworld.org/clinical-nursing-practice/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/clinical-nursing-practice.html","journal":"jcnp","managejournal":"Journal of Clinical Nursing and Practice"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/international-journal-of-collaborative-research-on-internal-medicine--public-health-flyer.jpg","home_url":"https://www.iomcworld.org/internal-medicine-public-health.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/internal-medicine-public-health/editors.html","ci_url":"https://www.iomcworld.org/internal-medicine-public-health/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/international-collaborative-research-internal-medicine-public-health.html","journal":"ijcrimph","managejournal":"International Journal of Collaborative Research on Internal Medicine & Public Health"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/international-journal-of-pharmacy-teaching--practices-flyer.jpg","home_url":"https://www.iomcworld.org/pharmacy-teaching-practices.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/pharmacy-teaching-practices/editors.html","ci_url":"https://www.iomcworld.org/pharmacy-teaching-practices/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/pharmacy-teaching-practices.html","journal":"ijptp","managejournal":"International Journal of Pharmacy Teaching & Practices"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/oncology--cancer-case-reports-flyer.jpg","home_url":"https://www.iomcworld.org/oncology-cancer-case-reports.html","rel_keyword":"open-access","journal_logo":"Oncology-&-Cancer-Case-Reports-logo.png","eb_url":"https://www.iomcworld.org/oncology-cancer-case-reports/editorial-board.html","ci_url":"https://www.iomcworld.org/oncology-cancer-case-reports/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/oncology-cancer-case-reports.html","journal":"occrs","managejournal":"Oncology & Cancer Case Reports"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/journal-of-neuroscience-and-neuropharmacology-flyer.jpg","home_url":"https://www.iomcworld.org/neurochemistry-neuropharmacology.html","rel_keyword":"open-access","journal_logo":"Journal-of-Neuroscience-and-Neuropharmacology-logo.jpg","eb_url":"https://www.iomcworld.org/neurochemistry-neuropharmacology/editorial-board.html","ci_url":"https://www.iomcworld.org/neurochemistry-neuropharmacology/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/neuroscience-neuropharmacology.html","journal":"ncoa","managejournal":"Journal of Neuroscience and Neuropharmacology"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/clinical-and-experimental-psychology-flyer.jpg","home_url":"https://www.iomcworld.org/clinical-experimental-psychology.html","rel_keyword":"open-access","journal_logo":"clinical-and-experimental-psychology-logo.svg","eb_url":"https://www.iomcworld.org/clinical-experimental-psychology/editorial-board.html","ci_url":"https://www.iomcworld.org/clinical-experimental-psychology/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/clinical-experimental-psychology.html","journal":"cep","managejournal":"Clinical and Experimental Psychology"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/Primary-Health-Care-Open-Access-flyer.jpg","home_url":"https://www.iomcworld.org/primary-health-care-open-access.html","rel_keyword":"open-access","journal_logo":"Primary-Healthcare-Open-Access-logo.png","eb_url":"https://www.iomcworld.org/primary-health-care-open-access/editorial-board.html","ci_url":"https://www.iomcworld.org/primary-health-care-open-access/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/primary-health-care-open-access.html","journal":"jphc","managejournal":"Primary Health Care: Open Access"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/health-economics--outcome-research-open-access-flyer.jpg","home_url":"https://www.iomcworld.org/health-economics-outcome-research.html","rel_keyword":"open-access","journal_logo":"health-economics--outcome-research-open-access-logo.svg","eb_url":"https://www.iomcworld.org/health-economics-outcome-research/editorial-board.html","ci_url":"https://www.iomcworld.org/health-economics-outcome-research/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/health-economics-outcome-research-open-access.html","journal":"heor","managejournal":"Health Economics & Outcome Research: Open Access"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/Journal-of-Multiple-Sclerosis-flyer.jpg","home_url":"https://www.iomcworld.org/multiple-sclerosis-open-access.html","rel_keyword":"open-access","journal_logo":"Journal-of-Multiple-Sclerosis-logo.png","eb_url":"https://www.iomcworld.org/multiple-sclerosis-open-access/editorial-board.html","ci_url":"https://www.iomcworld.org/multiple-sclerosis-open-access/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/multiple-sclerosis.html","journal":"jmso","managejournal":"Journal of Multiple Sclerosis"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/Journal-of-Neurology--Neurophysiology-flyer.jpg","home_url":"https://www.iomcworld.org/neurology-neurophysiology.html","rel_keyword":"open-access","journal_logo":"journal-of-neurology--neurophysiology-logo.svg","eb_url":"https://www.iomcworld.org/neurology-neurophysiology/editorial-board.html","ci_url":"https://www.iomcworld.org/neurology-neurophysiology/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/neurology-neurophysiology.html","journal":"jnn","managejournal":"Journal of Neurology & Neurophysiology"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/medical-reports--case-studies-flyer.jpg","home_url":"https://www.iomcworld.org/medical-reports-case-studies.html","rel_keyword":"open-access","journal_logo":"Medical-Reports-&-Case-Studies-logo.png","eb_url":"https://www.iomcworld.org/medical-reports-case-studies/editorial-board.html","ci_url":"https://www.iomcworld.org/medical-reports-case-studies/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/medical-reports-case-studies.html","journal":"mrcs","managejournal":"Medical Reports & Case Studies"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/journal-of-arthritis-flyer.jpg","home_url":"https://www.iomcworld.org/arthritis.html","rel_keyword":"open-access","journal_logo":"Journal-of-Arthritis-logo.png","eb_url":"https://www.iomcworld.org/arthritis/editorial-board.html","ci_url":"https://www.iomcworld.org/arthritis/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/arthritis.html","journal":"jahs","managejournal":"Journal of Arthritis"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/journal-of-cellular-and-molecular-biology-research-flyer.jpg","home_url":"https://www.iomcworld.org/cellular-molecular-biology-research.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/cellular-molecular-biology-research/editorial-board.html","ci_url":"https://www.iomcworld.org/cellular-molecular-biology-research/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/cellular-molecular-biology-research.html","journal":"jmcb","managejournal":"Journal of Cellular and Molecular Biology Research"},{"flyerimg":null,"home_url":"https://www.iomcworld.org/current-research-virology-retrovirology.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/current-research-virology-retrovirology/editorial-board.html","ci_url":"https://www.iomcworld.org/current-research-virology-retrovirology/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/current-research-virology-retrovirology.html","journal":"crvr","managejournal":"Current research in Virology & Retrovirology"},{"flyerimg":null,"home_url":"https://www.iomcworld.org/plastic-surgery-case-studies.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/plastic-surgery-case-studies/editorial-board.html","ci_url":"https://www.iomcworld.org/plastic-surgery-case-studies/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/plastic-surgery-case-studies.html","journal":"pscs","managejournal":"Plastic Surgery: Case Studies"},{"flyerimg":null,"home_url":"https://www.iomcworld.org/applied-biology-pharmaceutical-technology.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/applied-biology-pharmaceutical-technology/editorial-board.html","ci_url":"https://www.iomcworld.org/applied-biology-pharmaceutical-technology/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/applied-biology-pharmaceutical-technology.html","journal":"ijabpt","managejournal":"International Journal of Applied Biology and Pharmaceutical Technology"},{"flyerimg":null,"home_url":"https://www.iomcworld.org/bioenergy-bioresource.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/bioenergy-bioresource/editorial-board.html","ci_url":"https://www.iomcworld.org/bioenergy-bioresource/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/bioenergy-bioresource.html","journal":"bboa","managejournal":"Bioenergy and Bioresource:Open Access"},{"flyerimg":null,"home_url":"https://www.iomcworld.org/general-dentistry.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/general-dentistry/editorial-board.html","ci_url":"https://www.iomcworld.org/general-dentistry/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/general-dentistry.html","journal":"jgd","managejournal":"Journal of General Dentistry"},{"flyerimg":"https://www.iomcworld.org/admin/flyers/international-journal-of-innovative-research-in-science-engineering-and-technology-flyer.jpg","home_url":"https://www.iomcworld.org/innovative-research-science-engineering-technology.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.iomcworld.org/innovative-research-science-engineering-technology/editorial-board.html","ci_url":"https://www.iomcworld.org/innovative-research-science-engineering-technology/current-issue.html","track_paper":"https://www.scholarscentral.org/submissions/innovative-research-science-engineering-technology.html","journal":"ijirset","managejournal":"International Journal of Innovative Research in Science, Engineering and Technology"}]
     */

    private boolean status;
    private int journals_cnt;
    private List<JournalDetailsBean> journal_details;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getJournals_cnt() {
        return journals_cnt;
    }

    public void setJournals_cnt(int journals_cnt) {
        this.journals_cnt = journals_cnt;
    }

    public List<JournalDetailsBean> getJournal_details() {
        return journal_details;
    }

    public void setJournal_details(List<JournalDetailsBean> journal_details) {
        this.journal_details = journal_details;
    }

    public static class JournalDetailsBean {
        /**
         * flyerimg : https://www.iomcworld.org/admin/flyers/jbtw-flyer.jpg
         * home_url : https://www.iomcworld.org/biology-todays-world.html
         * rel_keyword : articles
         * journal_logo : null
         * eb_url : https://www.iomcworld.org/biology-todays-world/editorial-board.html
         * ci_url : https://www.iomcworld.org/biology-todays-world/current-issue.html
         * track_paper : https://www.scholarscentral.org/submissions/biology-todays-world.html
         * journal : jbtw
         * managejournal : Journal of Biology and Today's World
         */

        private String flyerimg;
        private String home_url;
        private String rel_keyword;
        private String journal_logo;
        private String eb_url;
        private String ci_url;
        private String track_paper;
        private String journal;
        private String managejournal;

        public String getFlyerimg() {
            return flyerimg;
        }

        public void setFlyerimg(String flyerimg) {
            this.flyerimg = flyerimg;
        }

        public String getHome_url() {
            return home_url;
        }

        public void setHome_url(String home_url) {
            this.home_url = home_url;
        }

        public String getRel_keyword() {
            return rel_keyword;
        }

        public void setRel_keyword(String rel_keyword) {
            this.rel_keyword = rel_keyword;
        }

        public String getJournal_logo() {
            return journal_logo;
        }

        public void setJournal_logo(String journal_logo) {
            this.journal_logo = journal_logo;
        }

        public String getEb_url() {
            return eb_url;
        }

        public void setEb_url(String eb_url) {
            this.eb_url = eb_url;
        }

        public String getCi_url() {
            return ci_url;
        }

        public void setCi_url(String ci_url) {
            this.ci_url = ci_url;
        }

        public String getTrack_paper() {
            return track_paper;
        }

        public void setTrack_paper(String track_paper) {
            this.track_paper = track_paper;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }

        public String getManagejournal() {
            return managejournal;
        }

        public void setManagejournal(String managejournal) {
            this.managejournal = managejournal;
        }
    }
}
