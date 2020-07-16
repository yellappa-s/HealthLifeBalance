package com.example.healthassist.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anjali.healthguru.HomeRemedyAdaptor
import com.example.healthassist.R

class ExampleActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)
        val imageList = listOf<Images>(
            Images(
                R.drawable.cough,
                "Cough",
                "Honey tea. Share on Pinterest A popular home remedy for coughs is mixing honey with warm water. \n"+
                        "Ginger. Ginger may ease a dry or asthmatic cough, as it has anti-inflammatory properties. ..\n."+
                        "Fluids. ...\n" +
                        "Steam. ...\n" +
                        "Marshmallow root. ...\n" +
                        "Salt-water gargle. ...\n" +
                        "Bromelain. ...\n" +
                        "Thyme.\n"
            ),
            Images(
                R.drawable.dark_circles,
                "Dark Circles",
                "Apply a cold compress. A cold compress can help reduce swelling and shrink dilated blood vessels. ...\n" +
                        "Get extra sleep. Catching up on sleep can also help reduce the appearance of dark circles. ...\n" +
                        "Elevate your head. ...\n" +
                        "Soak with tea bags. ...\n" +
                        "Conceal with makeup.\n"
            ),
            Images(
                R.drawable.download,
                "Cold",
                "Make your own honey, lemon, and ginger cough drops. There are several recipes available online — find one that works for you.\n" +
                        "Sip warm tea with honey and lemon.\n" +
                        "Gargle with warm saltwater.\n" +
                        "Drink warm, clear broth.\n" +
                        "Enjoy a cold treat like a fresh fruit ice pop."
            ),
            Images(
                R.drawable.fever,
                "Fever",
                "Drink plenty of fluids. Fever can cause fluid loss and dehydration, so drink water, juices or broth. ...\n" +
                        "Rest. You need rest to recover, and activity can raise your body temperature.\n" +
                        "Stay cool. Dress in light clothing, keep the room temperature cool and sleep with only a sheet or light blanket.\n"
            ),
            Images(
                R.drawable.hair_fall,
                "HAIR FALL",
                "Massage. Massaging the scalp can help to restore hair growth and can be used in conjunction with hair oils and masks. ...\n" +
                        "Aloe vera. ...\n" +
                        "Coconut oil. ...\n" +
                        "Viviscal. ...\n" +
                        "Fish oil. ...\n" +
                        "Ginseng. ...\n" +
                        "Onion juice. ...\n" +
                        "Rosemary oil.\n" +
                        "\n"
            ),
            Images(
                R.drawable.hair_growth,
                "Hair Grwoth",
                "Their proven benefits can help to stimulate growth and enhance the hair that you have.\n" +
                        "Massage. Massaging the scalp can help to restore hair growth and can be used in conjunction with hair oils and masks. ...\n" +
                        "Aloe vera. ...\n" +
                        "Coconut oil. ...\n" +
                        "Viviscal. ...\n" +
                        "Fish oil. ...\n" +
                        "Ginseng. ...\n" +
                        "Onion juice. ...\n" +
                        "\n"
            ),
            Images(
                R.drawable.joint_pain,
                "Joint Pains",
                "Use hot and cold therapy\n" +
                        "Heat treatments can include taking a long, warm shower or bath in the morning to help ease stiffness and using an electric blanket or moist heating pad to reduce discomfort overnight.\n" +
                        "Cold treatments can help relieve joint pain, swelling, and inflammation.\n"
            ),
            Images(
                R.drawable.pimple,
                "Pimples",
                "Below are 13 home remedies for acne that you might want to try.\n" +
                        "Apply apple cider vinegar. ...\n" +
                        "Take a Zinc Supplement. ... Make a Honey and Cinnamon Mask. ...\n" +
                        "Spot Treat With Tea Tree Oil. ...\n" +
                        "Apply Green Tea to Your Skin. ...\n" +
                        "Apply Witch Hazel. ...\n" +
                        "Moisturize With Aloe Vera. ...\n" +
                        "Take a Fish Oil Supplement.\n" +
                        "\n" +
                        "\n"
            ),
            Images(
                R.drawable.stomach_pain,
                "Stomach Pain",
                "Some of the most popular home remedies for an upset stomach and indigestion include:\n" +
                        "Drinking water. ...\n" +
                        "Avoiding lying down. ...\n" +
                        "Ginger. ...\n" +
                        "Mint. ...\n" +
                        "Taking a warm bath or using a heating bag. ...\n" +
                        "BRAT diet. ...\n" +
                        "Avoiding smoking and drinking alcohol. ...\n" +
                        "Avoiding difficult-to-digest foods."
            ),
            Images(
                R.drawable.throat_pain,
                "Throat Pain",
                "Gargle with salt water. Gargling with warm salt water can help soothe a scratchy throat. ...\n" +
                        "Suck on a lozenge. ...\n" +
                        "Try OTC pain relief. ...\n" +
                        "Enjoy a drop of honey. ...\n" +
                        "Try an echinacea and sage spray. ...\n" +
                        "Stay hydrated. ...\n" +
                        "Use a humidifier. ...\n" +
                        "Give yourself a steam shower."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = HomeRemedyAdaptor(this, imageList) {
            val intent = Intent(this, HomeRemedyActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}
