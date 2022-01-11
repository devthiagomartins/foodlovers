import './styles.css';
import {ReactComponent as SaveIcon} from 'assets/img/save.svg';
import {ReactComponent as CancelIcon} from 'assets/img/cancel.svg';

function Form() {

  const food = {
    id: 1,
    image: "https://t1.rg.ltmcdn.com/pt/images/9/8/3/img_pizza_calabresa_e_mussarela_4389_orig.jpg",
    title: "Pizza de Calabresa",
    count: 2,
    score: 4.5
  };

  return (
    <div className="foodlovers-form-container">
      <img className="foodlovers-food-card-image" src={food.image} alt={food.title}/>
      <div className="foodlovers-card-bottom-container">
        <h3>{food.title}</h3>
        <form className="foodlovers-form">
          <div className="form-group foodlovers-form-group">
            <label htmlFor="email">Informe seu email</label>
            <input type="email" className="form-control" id="email" />
          </div>
          <div className="form-group foodlovers-form-group">
            <label htmlFor="score">Informe sua avaliação</label>
            <select className="form-control" id="score">
              <option>1</option>
              <option>2</option>
              <option>3</option>
              <option>4</option>
              <option>5</option>
            </select>
          </div>
          <div className="foodlovers-form-btn-container">
            <button type="submit" className="btn btn-warning foodlovers-btn-save"><SaveIcon className="IconsDimension" />&nbsp;Salvar</button>
          </div>
        </form >
        <button className="btn btn-danger foodlovers-btn mt-3"><CancelIcon className="IconsDimension" />&nbsp;Cancelar</button>
      </div >
    </div >
  );
}

export default Form;