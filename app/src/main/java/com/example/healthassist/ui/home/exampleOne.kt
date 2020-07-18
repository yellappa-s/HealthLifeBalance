package com.example.healthassist.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.healthassist.R

class exampleOne : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_one)
        val imageList = listOf<Images>(
            Images(
                R.drawable.bites,
                "Bites/Stings",
                "For mild reactions\n" +
                        "Move to a safe area to avoid more bites or stings.\n" +
                        "If needed, remove the stinger.\n" +
                        "Wash the area with soap and water.\n" +
                        "Apply a cool compress. ...\n" +
                        "Apply 0.5 or 1 percent hydrocortisone cream, calamine lotion or a baking soda paste to the bite or sting several times daily until your symptoms go away.\n"
            ),
            Images(
                R.drawable.breathing,
                "Breathlessness",
                "First Aid\n" +
                        "Check the person's airway, breathing, and pulse. ...\n" +
                        "Loosen any tight clothing.\n" +
                        "Help the person use any prescribed medicine (such as an asthma inhaler or home oxygen).\n" +
                        "Continue to monitor the person's breathing and pulse until medical help arrives.\n" +
                        "\n"
            ),
            Images(
                R.drawable.burns,
                "Burns ",
                "To treat a burn, follow the first aid advice below:\n" +
                        "immediately get the person away from the heat source to stop the burning.\n" +
                        "cool the burn with cool or lukewarm running water for 20 minutes – don't use ice, iced water, or any creams or greasy substances such as butter.\n" +
                        "Cool the burn. Immediately immerse the burn in cool tap water or apply cold, wet compresses. ...\n" +
                        "Apply petroleum jelly two to three times daily. ...\n" +
                        "Cover the burn with a nonstick, sterile bandage. ...\n" +
                        "Consider taking over-the-counter pain medication. ...\n" +
                        "Protect the area from the sun.\n"
            ),
            Images(
                R.drawable.chocking,
                "Chocking",
                "Give 5 back blows. Stand to the side and just behind a choking adult. For a child, kneel down behind. ...\n" +
                        "Give 5 abdominal thrusts. Perform five abdominal thrusts (also known as the Heimlich maneuver).\n" +
                        "Alternate between 5 blows and 5 thrusts until the blockage is dislodged.\n\n"
            ),
            Images(
                R.drawable.dogbite,
                "Dog Bite",
                "Dog Bite Treatments\n" +
                        "Place a clean towel over the injury to stop any bleeding.\n" +
                        "Try to keep the injured area elevated.\n" +
                        "Wash the bite carefully with soap and water.\n" +
                        "Apply a sterile bandage to the wound.\n" +
                        "Apply antibiotic ointment to the injury every day to prevent infection.\n"
            ),
            Images(
                R.drawable.electricshock,
                "Electric Shock",
                "Take these actions immediately while waiting for medical help:\n" +
                        "Turn off the source of electricity, if possible. ...\n" +
                        "Begin CPR if the person shows no signs of circulation, such as breathing, coughing or movement.\n" +
                        "Try to prevent the injured person from becoming chilled.\n" +
                        "Apply a bandage.\n"
            ),
            Images(
                R.drawable.fractures,
                "Fractures",
                "Stop any bleeding. Apply pressure to the wound with a sterile bandage, a clean cloth or a clean piece of clothing.\n" +
                        "Immobilize the injured area. Don't try to realign the bone or push a bone that's sticking out back in. ...\n" +
                        "Apply ice packs to limit swelling and help relieve pain. ...\n" +
                        "Treat for shock.\n"
            ),
            Images(
                R.drawable.heartattack,
                "Heart Attack",
                "What to do if you or someone else may be having a heart attack\n" +
                        "Call 911 or your local emergency number. ...\n" +
                        "Chew and swallow an aspirin, unless you are allergic to aspirin or have been told by your doctor never to take aspirin.\n" +
                        "Take nitroglycerin, if prescribed. ...\n" +
                        "Begin CPR if the person is unconscious.\n" +
                        "If you think someone is having a heart attack: Have the person sit down, rest, and try to keep calm. Loosen any tight clothing. Ask if the person takes any chest pain medicine, such as nitroglycerin, for a known heart condition, and help them take it.\n" +
                        "\n"
            ),
            Images(
                R.drawable.highbp,
                "High blood Pressure",
                "Exercise most days of the week. Exercise is the most effective way to lower your blood pressure. ...\n" +
                        "Consume a low-sodium diet. Too much sodium (or salt) causes blood pressure to rise. ...\n" +
                        "Limit alcohol intake to no more than 1 to 2 drinks per day. ...\n" +
                        "Make stress reduction a priority.\n"
            ),
            Images(
                R.drawable.majorcuts,
                "Major Cuts And Wounds",
                "Cuts and scrapes: First aid\n" +
                        "Wash your hands. This helps avoid infection.\n" +
                        "Stop the bleeding. Minor cuts and scrapes usually stop bleeding on their own. ...\n" +
                        "Clean the wound. Rinse the wound with water. ...\n" +
                        "Apply an antibiotic or petroleum jelly. ...\n" +
                        "Cover the wound. ...\n" +
                        "Change the dressing. ...\n" +
                        "Get a tetanus shot. ...\n" +
                        "Watch for signs of infection.\n"
            ),
            Images(
                R.drawable.snakebite,
                "Snake Bite",
                "Move the person beyond striking distance of the snake.\n" +
                        "Have the person lie down with wound below the heart.\n" +
                        "Keep the person calm and at rest, remaining as still as possible to keep venom from spreading.\n" +
                        "Cover the wound with loose, sterile bandage.\n" +
                        "Remove any jewelry from the area that was bitten."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = HomeRemedyAdaptor(this, imageList){
            val intent = Intent(this, FirstAidActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}
