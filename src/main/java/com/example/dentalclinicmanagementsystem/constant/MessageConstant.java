package com.example.dentalclinicmanagementsystem.constant;

public class MessageConstant {

    public static class User{
        private User(){}

        public static final String USER_NOT_FOUND = "user not found";
        public static final String USERNAME_NOT_FOUND = "username not found";
        public static final String WRONG_PASSWORD = "wrong password";
        public static final String ACCESS_DENY = "access deny";
    }

    public static class Material{
        private Material(){}

        public static final String MATERIAL_NOT_FOUND = "material not found";
        public static final String MATERIAL_NAME_ALREADY_EXIST = "material name already exist";

    }

    public static class MaterialImport{
        private MaterialImport(){}

        public static final String MATERIAL_IMPORT_NOT_FOUND = "material import not found";
        public static final String MATERIAL_IMPORT_OVER_DATE = "material import over date";
    }

    public static class CategoryService{
        private CategoryService(){}

        public static final String CATEGORY_NOT_FOUND = "category not found";
        public static final String CATEGORY_NAME_ALREADY_EXIST = "category name already exist";
        public static final String CATEGORY_HAVE_BEEN_USED = "category have been use";
    }

    public static class Service {

        private Service(){}

        public static final String SERVICE_NOT_FOUND = "service not found";
        public static final String SERVICE_NAME_ALREADY_EXIST = "service name already exist";

    }

    public static class Patient {

        private Patient(){}

        public static final String PATIENT_NOT_FOUND = "patient not found";
        public static final String PATIENT_HAVE_BEEN_USED = "patient have been use";

    }

    public static class PatientRecord {

        private PatientRecord(){}

        public static final String PATIENT_RECORD_NOT_FOUND = "patient record not found";
        public static final String PATIENT_RECORD_OVER_DATE = "patient record over date";

    }

    public static class Labo {
        private Labo(){}

        public static final String LABO_NOT_FOUND = "labo not found";
        public static final String LABO_NAME_ALREADY_EXIST = "labo name already exist";
    }

    public static class MaterialExport{
        private MaterialExport(){}

        public static final String MATERIAL_EXPORT_NOT_FOUND = "material export not found";
        public static final String MATERIAL_EXPORT_OVER_DATE = "material export over date";
    }

    public static class Receipt {
        private Receipt(){}

        public static final String RECEIPT_NOT_FOUND = "bill not found";
        public static final String RECEIPT_OVER_DATE = "bill over date";
    }

    public static class Timekeeping{
        private Timekeeping(){}

        public static final String CHECKOUT_NOTABLE = "checkout notable";
        public static final String CHECKIN_NOTABLE = "checkin notable";

    }

    public static class Bill{
        private Bill(){}

        public static final String BILL_NOT_FOUND = "bill not found";

    }

    public static class Token {

        private Token(){}

        public static final String ACCESS_DENY = "access deny";
        public static final String TOKEN_EXPIRE = "Unauthorized. Token is expired";
    }
}
