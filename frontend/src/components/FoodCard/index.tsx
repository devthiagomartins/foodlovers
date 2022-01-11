import FoodScore from "components/FoodScore";
import { Link } from "react-router-dom";
import './styles.css';

function FoodCard() {

  const food = {
    id: 1,
    image: "https://t1.rg.ltmcdn.com/pt/images/9/8/3/img_pizza_calabresa_e_mussarela_4389_orig.jpg",
    title: "Pizza de Calabresa",
    count: 2,
    score: 4.5
  };

  return (

    <div>
      <img className="foodlovers-food-card-image" src={food.image} alt={food.title} />
      <div className="foodlovers-card-bottom-container">
        <h3>{food.title}</h3>
        <FoodScore />
        <Link to={`/form/${food.id}`}>
          <div className="btn btn-warning foodlovers-btn-save">Avaliar</div>
        </Link>
      </div>
    </div>
  );
}

export default FoodCard;