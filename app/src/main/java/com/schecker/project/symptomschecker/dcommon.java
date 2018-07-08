package com.schecker.project.symptomschecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class dcommon extends AppCompatActivity {
    String fp = "Food poisoning\n" +
            "•\tFoodborne illness, more commonly referred to as food poisoning, is the result of eating contaminated, spoiled, or toxic food. The most common symptoms of food poisoning include nausea, vomiting, and diarrhea.\n\nFood poisoning can also be caused by a virus. The Norovirus, also known as the Norwalk virus, causes over 19 million cases of food poisoning each year, and in rare cases, it can be fatal. Sapovirus, Rotavirus, and Astrovirus bring on similar symptoms, but they’re less common. Hepatitis A virus is a serious condition that can be transmitted through food.\n\nBacteria is by far the most prevalent cause of food poisoning. When thinking of dangerous bacteria, names like E. coli, listeria and salmonella come to mind for good reason. \n\nSymptoms:\ndiarrhea\nvomiting\nmild fever\nweakness\nnausea\nheadaches";
    String malaria = "Malaria is a life-threatening disease that’s typically transmitted through the bite of an infected Anopheles mosquito. Malaria is usually found in tropical and subtropical climates where the parasites that cause it live.\n\ncongenital malaria occurs when a mother with malaria passes on the disease to her baby at birth. Malaria is a life-threatening disease. It’s typically transmitted through the bite of an infected Anopheles mosquito.Infected mosquitoes carry the Plasmodium parasite.\n\nWhen this mosquito bites you, the parasite is released into your bloodstream. Once the parasites are inside your body, they travel to the liver, where they mature. After several days, the mature parasites enter the bloodstream and begin to infect red blood cells. Within 48 to 72 hours, the parasites inside the red blood cells multiply, causing the infected cells to burst open.\n\nSymptoms\nhigh fever, \nprofuse sweating\nheadache\nvomiting\nmuscle pain\nbloody stools";
    String polio = "Polio (also known as poliomyelitis) is a highly contagious disease caused by a virus that attacks the nervous system. Children younger than 5 years old are more likely to contract the virus than any other group.According to the World Health Organization (WHO), 1 in 200 polio infections will result in permanent paralysis.\n\nHowever, thanks to the global polio eradication initiative in 1988, the following regions are now certified polio-free: Americas, Europe, Western Pacific, Southeast Asia. The polio vaccine was developed in 1953 and made available in 1957. Since then cases of polio have dropped in United States.\n\nSymptoms\nfever\nsore throat\nheadache\nvomiting\nfatigue\nBack pain\nNeck pain";
    String flu = "Influenza is a viral infection that attacks your respiratory system-nose ,throat, and lungs. For most people, influenza resolves on its own, but sometime, influenza and its complications can be deadly.\n\npeople at higher risk of developing flu complications include: Young children under 5,and especially those under 2 years, Adults older than 65, Pregnant women, People with weakened immune systems, People who have asthma, heart diseases, kidney diseases, diabetes and body mass index(BMI) of  40 or higher.\n\nSymptoms\nFever\nAching muscles\nSweats\nHeadache\nSore throat\nFatigue";
    String yf = "Yellow fever is a serious, potentially deadly flu-like disease spread by mosquitoes. It’s characterized by a high fever and jaundice. Jaundice is yellowing of the skin and eyes, which is why this disease is called yellow fever.\n\nThis disease is most prevalent in certain parts of Africa and South America. It isn’t curable, but you can prevent it with the yellow fever vaccine.\n\nSymptoms\nheadaches\nmuscle aches\njoint aches\nchills\nfever\nshivers\nred eyes";
    String bt = "Brain tumor\n" +
            "The brain and spinal column make up the central nervous system (CNS), where all vital functions are controlled. These functions include thought, speech, and body movements.\n\nThis means that when a tumor grows in the CNS, it can affect a person's thought processes, the way they talk, or movements.\n\nThis section describes primary brain tumors, which are those that start in the brain. A primary brain tumor is described as low grade or high grade. A low-grade tumor generally grows slowly, but can turn into a high-grade tumor. A high-grade tumor is more likely to grow faster.\n\nThis section describes primary brain tumors, which are those that start in the brain. A primary brain tumor is described as low grade or high grade. A low-grade tumor generally grows slowly, but can turn into a high-grade tumor. A high-grade tumor is more likely to grow faster.\n\nSymptoms:\nMyclonic\nSensory\nDrowsiness\nFatigue\nMemory problems\nDrowsiness.\n";
    String hf = "Heart failure\n" +
            "Heart failure, sometimes known as congestive heart failure, occurs when your heart muscle doesn't pump blood as well as it should. \n\nCertain conditions, such as narrowed arteries in your heart (coronary artery disease) or high blood pressure, gradually leave your heart too weak or stiff to fill and pump efficiently.\n\nNot all conditions that lead to heart failure can be reversed, but treatments can improve the signs and symptoms of heart failure and help you live longer. Lifestyle changes — such as exercising, reducing salt in your diet, managing stress and losing weight — can improve your quality of life.\n\nOne way to prevent heart failure is to control conditions that cause heart failure, such as coronary artery disease, high blood pressure, diabetes or obesity.\n\nSymptoms:\nFatigue\nirregular heartbeat\nSwelling\nChest pain\nPersistent cough\n nausea.\n";
    String dehydration = "Dehydration\n" +
            "•Dehydration means your body loses more fluids than you take in. This can affect your body but in most cases it’s nothing serious.\n\n Drink fluids when you feel any dehydration symptoms. Keep taking small sips. You can use a spoon to make it easier for your child to swallow the fluids.\n\n You can buy special sachets from a pharmacy. They’re called oral rehydration solutions and you mix them with water. They contain salt, sugar and minerals that your body loses when you’re not drinking enough.\n\nSymptoms:\n feeling thirsty\n feeling dizzy\n feeling tired\n dry mouth\n Sunken eyes\n Fatigue\n.\n";
    String diabetes = "Diabetes\n" +
            "•\tDiabetes describes a group of metabolic diseases where a patient has high blood sugar due to problems processing or producing insulin. Diabetes can affect anyone, regardless of age, race, gender, or lifestyle.\n\n the death rate for women with diabetes showed no signs of improvement. Additionally, the difference in death rates between women who had diabetes and those who didn’t more than doubled.\n\n If you have diabetes and are pregnant or hoping to become pregnant, talk to your doctor about the best ways to manage your and your baby’s health. For instance, your blood glucose levels and general health need to be tracked before and during your pregnancy. \n\n When you’re pregnant, blood glucose and ketones travel through the placenta to the baby. Babies require energy from glucose just as you do. However, babies are at risk for birth defects if your glucose levels are too high.\n\nSymptoms:\n frequent urination\n blurred vision\n irritability\n nausea\n wounds that heal slowly\n skin infections.\n";
    String ei = "Ear infections\n" +
            "•\tAn ear infection occurs when a bacterial or viral infection affects the middle ear—the sections of your ear just behind the eardrum. Ear infections can be painful because of inflammation and fluid build up in the middle ear.\n\n Ear infections can be chronic or acute. Acute ear infections are painful but short in duration. \n\n Chronic ear infections do not clear up, or they recur many times. Chronic ear infections can cause permanent damage to the middle and inner ear.\n\nSymptoms:\n hearing loss\n pus-like ear drainage\n fussiness in young infants\n mild pain\n discomfort inside the ear.\n";
    String cs = "Cold sore\n" +
            "Cold sores — also called fever blisters — are a common viral infection. They are tiny, fluid-filled blisters on and around your lips.\n These blisters are often grouped together in patches. After the blisters break, a crust forms over the resulting sore. Cold sores usually heal in two to four weeks without leaving a scar.\n\n Cold sores spread from person to person by close contact, such as kissing. \n\n They're caused by a herpes simplex virus (HSV-1) closely related to the one that causes genital herpes (HSV-2). Both of these viruses can affect your mouth or genitals and can be spread by oral sex. Cold sores are contagious even if you don't see the sores.\n\n There's no cure for HSV infection, and the blisters may return. Antiviral medications can help cold sores heal more quickly and may reduce how often they return.\n\nSymptoms:\nfever\nPainful eroded gums\nsore throat\nHeadache\nmuscle aches\nSwollen lymph nodes.\n";
    String hs = "Heat stroke\n" +
            "•\tYou might think heatstroke, also referred to as sunstroke, is not something to worry about in this country, but you’d be wrong.\n\n Although it normally affects people during a heatwave it can also happen if you’re not drinking enough and are doing very strenuous physical exercise.\n Severe heatstroke is life threatening and is a medical emergency. It happens when a person's body temperature becomes dangerously high and they are unable to cool down.\n\nSymptoms:\n Feeling and being sick\n Dizziness\n Intense thirst\n Rapid heartbeat\n Confusion\n Unconsciousnes.\n";
    String gout = "Gout is a kind of arthritis. It can cause an attack of sudden burning pain,stiffness, and swelling in a joint, usually a big toe.\n\nThese attacks can happen over and over unless goutis treated. Over time, they can harm your joints, tendons, and other tissues.\n\n Gout is most common in men.Gout is caused by too much uric acid in the blood.Most of the time, having too much uric acid isn't harmful. Many people with high levels in their blood never get gout.But when uric acid levels in your blood are too high, the uric acid may form hard crystals in your joints.\n\nYour chances of getting gout are higher if you are overweight,drink too much alcohol, or eat too much meat and fish that are high in chemicals called purines.\n\nSymptoms:\nextreme tenderness in a joint,\npodagra\nred or purplish skin\nInflammation\nredness";
    String aids = "Approximately 80 percent of people who are infected with HIV " +
            "experience flu-like symptoms within two to four weeks of becoming " +
            "infected. \n\nThis flu-like illness is known as acute HIV infection. It’s the " +
            "primary stage of the infection and lasts until the body has created " +
            "antibodies against the HIV virus.Symptoms typically last 1 to 2 weeks." +
            "If you have several of these symptoms and suspect you may have been " +
            "infected, schedule an appointment with your doctor and get " +
            "tested.\n\nAfter the initial symptoms disappear, HIV may not cause any " +
            "other symptoms for months or years. During this time, the virus " +
            "replicates within your body and begins to weaken your immune " +
            "system. \n\nYou won’t feel or look sick, but the virus is still active. You " +
            "can easily transmit it to others. This is why early testing, even when you " +
            "feel fine, is so important.\n\nSymptoms:\nbody rash\nfever\nsore" +
            "throat\nmuscle aches\nnausea and vomiting";
    String cholera = "Cholera is a serious bacterial disease that usually causes severe diarrhea " +
            "and dehydration. The disease is typically spread through contaminated " +
            "water.\n\nIn severe cases, immediate treatment is necessary because " +
            "death can occur within hours. This can happen even if you were healthy " +
            "before you caught it.Modern sewage and water treatment have " +
            "effectively eliminated cholera in most countries. It’s still a problem in " +
            "countries in Asia, Latin America, Africa, India, and the Middle " +
            "East.\n\nCountries affected by war, poverty, and natural disasters have the " +
            "greatest risk for a cholera outbreak. That’s because these conditions " +
            "tend to force people to live in crowded areas without proper " +
            "sanitation.\nCholera is caused by bacteria called Vibrio cholerae. The " +
            "disease’s deadly effects are the result of a strong toxin known as CTX " +
            "that is produced by these bacteria in your small intestine.\n\nCTX " +
            "interferes with the normal flow of sodium and chloride when it binds to " +
            "your intestinal walls. \n\nSymptoms: sudden onset of" +
            "diarrhea\nnausea\nmild to severe\n" +
            "dehydration\nconvulsions\ncoma\nfever\n";
    String td = "Tooth decay is damage that occurs when germs (bacteria) in " +
            "your mouth make acids that eat away at a tooth.\n\nBacteria and " +
            "food can cause tooth decay. A clear, sticky substance " +
            "called plaque is always forming on your teeth and gums. Plaque " +
            "contains bacteria that feed on the sugars in the food you eat.\n\nAs " +
            "the bacteria feed, they make acids. The acids attack the teeth for " +
            "20 minutes or more after you eat. Over time, these acids " +
            "destroy tooth enamel, causing tooth " +
            "decay.\n\nSymptoms:\nToothache\nTooth sensitivity\nVisible\n" +
            "holes in teeth\npain when you bite\nBlack staining on teeth\n";
    String vertigo = "Vertigo is a sensation of feeling off balance. If you have these dizzy" +
            "spells, you might feel like you are spinning or that the world" +
            "around you is spinning.\n\nThis is an inner ear problem usually" +
            "related to infection (usually viral). The infection causes" +
            "inflammation in the inner ear around nerves that are important for" +
            "helping the body sense balance Treatment for vertigo depends " +
            "on what's causing it. In many cases, vertigo goes away without any " +
            "treatment. This is because your brain is able to adapt, at least in " +
            "part, to the inner ear changes, relying on other mechanisms to " +
            "maintain balance.\nThis is a type of physical therapy aimed at " +
            "helping strengthen the vestibular system. The function of the " +
            "vestibular system is to send signals to the brain about head and " +
            "body movements relative to " +
            "gravity.\n\nSymptoms:\nTilting\nSwaying\nSpinning\nFeeling\n" +
            "nauseated\nVomiting";
    String sc = "Stomach cancer begins when cancer cells form in the inner lining " +
            "of your stomach. These cells can grow into a tumor. Also called " +
            "gastric cancer, the disease usually grows slowly over many " +
            "years.\n\nIf you know the symptoms it causes, you and your doctor " +
            "may be able to spot it early, when it’s easiest to treat.Scientists " +
            "don’t know exactly what makes cancer cells start growing in the " +
            "stomach. But they do know a few things that can raise your risk for " +
            "the disease. One of them is infection with a common bacteria, H. " +
            "pylori, which causes ulcers.\n\nSymptoms:\nIndigestion\nLoss of\n" +
            "appetite\nTrouble swallowing\nSwelling in your stomach\nfeeling\n" +
            "tired.";
    String bf = "Bird flu is an infection caused by a certain kind of\n" +
            "avian influenza virus.\n\nAlthough there are many kinds of bird flu," +
            "the most common kinds that concern health workers are H5N1" +
            "and H7N9 bird flu viruses.\n\nThese viruses are found in wild birds." +
            "Most of the time, wild birds don't get sick from the virus.But wild" +
            "birds can easily pass the virus to birds that are being raised for" +
            "food, such as chickens, ducks, and turkeys. The virus can cause" +
            "them to get very sick.\n\nUsually bird flu virus is not passed from" +
            "birds to people. But since 1997, some people have become sick" +
            "with this serious, deadly kind of bird flu. Most of these infections" +
            "have been in Asian countries among people who have had close" +
            "contact with birds raised on" +
            "farms.\n\nSymptoms:\nDiarrhea\nMalaise\nRunny\n" +
            "nose\nCough\nSore throat\nHeadache";
    String tuberculosis = "Tuberculosis (TB) is a disease caused by bacteria that are spread through the air from" +
            "person to person. If not treated properly, TB disease can be fatal.\n\nPeople infected with" +
            "TB bacteria who are not sick may still need treatment to prevent TB disease from" +
            "developing in the future. Learn to recognize the symptoms of TB disease and find out if" +
            "you are at risk.\nhe bacteria that cause TB is spread through the air from person to person. The" +
            "TB bacteria are put into the air when a person with TB disease coughs, sneezes, speaks, on" +
            "sings. People nearby may breathe in these bacteria and become infected. There are two types" +
            "of TB conditions: latent TB infection and TB disease.\n\nTB bacteria can live in the body without" +
            "making you sick. This is called latent TB infection. In most people who breathe in TB bacteria" +
            "and become infected, the body is able to fight the bacteria to stop them from growing. People" +
            "with latent TB infection do not feel sick, do not have any symptoms, and cannot spread TB ";
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dcommon);
        Intent i = getIntent();
        String d = i.getExtras().getString("disease");
        t = (TextView)findViewById(R.id.text);
        switch (d)
        {
            case "Malaria":
                t.setText(malaria);
                break;
            case "Food poisoning":
                t.setText(fp);
                break;
            case "Flu":
                t.setText(flu);
                break;
            case "Polio":
                t.setText(polio);
                break;
            case "Yellow fever":
                t.setText(yf);
                break;
            case "Brain tumor":
                t.setText(bt);
                break;
            case "Heart failure":
                t.setText(hf);
                break;
            case "Dehydration":
                t.setText(dehydration);
                break;
            case "Diabetes":
                t.setText(diabetes);
                break;
            case "Ear infections":
                t.setText(ei);
                break;
            case "Cold sore":
                t.setText(cs);
                break;
            case "Heat stroke":
                t.setText(hs);
                break;
            case "Gout":
                t.setText(gout);
                break;
            case "Aids":
                t.setText(aids);
                break;
            case "Cholera":
                t.setText(cholera);
                break;
            case "Tooth decay":
                t.setText(td);
                break;
            case "Vertigo":
                t.setText(vertigo);
                break;
            case "Stomach cancer":
                t.setText(sc);
                break;
            case "Bird flu":
                t.setText(bf);
                break;
            case "Tuberculosis":
                t.setText(tuberculosis);
                break;
        }
    }
}
